package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMI_Calculation extends JFrame implements ActionListener {

    private Container c;
    private ImageIcon icon, img;
    private JLabel jl1, jl2, jl3, jl4, titleLabel, weightLabel, heightLabel, rsltLabel, commentLabel, ftLabel, inLabel, kgLabel,comment;
    private JPanel panel1, panel2;
    private Font f1, f2, f4;
    private JButton calBtn;
    private JTextField wtField, feetField, inchField;

    BMI_Calculation() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(500, 100, 1000, 900);
        setTitle("BMI Calculator");
        setResizable(false);

        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(null);

        f1 = new Font("Georgia Pro Black", Font.BOLD, 35);
        f2 = new Font("Arial", Font.PLAIN, 30);
        f4 = new Font("Arial", Font.PLAIN, 25);

        icon = new ImageIcon(getClass().getResource("bmi_calculator 5.png"));
        this.setIconImage(icon.getImage());

        jl1 = new JLabel();
        jl1.setOpaque(true);
        jl1.setBackground(Color.BLUE);
        jl1.setBounds(0, 0, 1200, 20);
        c.add(jl1);

        jl2 = new JLabel();
        jl2.setOpaque(true);
        jl2.setBackground(Color.BLUE);
        jl2.setBounds(0, 0, 20, 900);
        c.add(jl2);

        jl3 = new JLabel();
        jl3.setOpaque(true);
        jl3.setBackground(Color.BLUE);
        jl3.setBounds(974, 0, 20, 900);
        c.add(jl3);

        jl4 = new JLabel();
        jl4.setOpaque(true);
        jl4.setBackground(Color.BLUE);
        jl4.setBounds(0, 840, 1200, 20);
        c.add(jl4);

        titleLabel = new JLabel("Calculate your Body Mass Index");
        titleLabel.setFont(f1);
        titleLabel.setBounds(150, 50, 900, 90);
        titleLabel.setForeground(Color.BLUE);
        c.add(titleLabel);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(153, 153, 694, 544);
        c.add(panel2);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(150, 150, 700, 550);
        panel1.setBackground(Color.DARK_GRAY);
        c.add(panel1);

        weightLabel = new JLabel("Weight");
        weightLabel.setBounds(35, 30, 170, 50);
        weightLabel.setForeground(Color.BLUE);
        weightLabel.setFont(f1);
        panel2.add(weightLabel);

        heightLabel = new JLabel("Height");
        heightLabel.setBounds(35, 240, 170, 50);
        heightLabel.setForeground(Color.BLUE);
        heightLabel.setFont(f1);
        panel2.add(heightLabel);

        wtField = new JTextField();
        wtField.setBounds(35, 110, 170, 70);
        wtField.setHorizontalAlignment(JTextField.CENTER);
        wtField.setFont(f2);
        panel2.add(wtField);

        kgLabel = new JLabel("kg");
        kgLabel.setBounds(220, 110, 50, 50);
        kgLabel.setFont(f4);
        panel2.add(kgLabel);

        feetField = new JTextField();
        feetField.setBounds(35, 300, 170, 70);
        feetField.setHorizontalAlignment(JTextField.CENTER);
        feetField.setFont(f2);
        panel2.add(feetField);

        ftLabel = new JLabel("feet");
        ftLabel.setBounds(220, 300, 50, 50);
        ftLabel.setFont(f4);
        panel2.add(ftLabel);

        inchField = new JTextField();
        inchField.setBounds(300, 300, 170, 70);
        inchField.setHorizontalAlignment(JTextField.CENTER);
        inchField.setFont(f2);
        panel2.add(inchField);

        inLabel = new JLabel("inches");
        inLabel.setBounds(490, 300, 80, 50);
        inLabel.setFont(f4);
        panel2.add(inLabel);

        img = new ImageIcon(getClass().getResource("calculate 1.png"));
        Image img1 = img.getImage();
        Image newImage = img1.getScaledInstance(200, 65, Image.SCALE_SMOOTH);
        img = new ImageIcon(newImage);

        calBtn = new JButton(img);
        calBtn.setBounds(270, 420, 200, 65);
        panel2.add(calBtn);

        rsltLabel = new JLabel("Your Body Mass Index is _ .");
        rsltLabel.setBounds(170, 750, 410, 60);
        rsltLabel.setFont(f4);
        c.add(rsltLabel);

        commentLabel = new JLabel("This is considered __ .");
        commentLabel.setBounds(530, 750, 400, 60);
        commentLabel.setFont(f4);
        c.add(commentLabel);

        comment = new JLabel();
        comment.setBounds(300, 750, 400, 60);
        comment.setFont(f4);
        c.add(comment);

        calBtn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        double feet, inch, kilogram;
        double height, bmi;

        try {
            feet = Double.parseDouble(feetField.getText());
            inch = Double.parseDouble(inchField.getText());
            kilogram = Double.parseDouble(wtField.getText());

            height = feet * 12;
            height = (height * 2.5) / 100;
            bmi = kilogram / (height * height);
           rsltLabel.setText("Your Body Mass Index is " +new DecimalFormat("00.00").format(bmi)+" . ");

            if (bmi < 18.5) {
                comment.setText("");
                commentLabel.setText(" This is considered as Underweight.");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                comment.setText("");
                commentLabel.setText(" This is considered as Normal.");
            } else if (bmi > 24.9 && bmi <= 29.9) {
                comment.setText("");
                commentLabel.setText(" This is considered as Overweight.");
            } else {
                comment.setText("");
                commentLabel.setText(" This is considered as Obese.");
            }

        } catch (Exception e) {
            rsltLabel.setText("");
            commentLabel.setText("");
            comment.setText(" Please check required textfield .");
        }

    }

    public static void main(String[] args) {

        BMI_Calculation bmi = new BMI_Calculation();
        bmi.setVisible(true);

    }

}