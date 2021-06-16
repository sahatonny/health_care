package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BMR_Calculation extends JFrame {

    private Container c;
    private ImageIcon icon, img;
    private JLabel jl1, titleLabel, sexLabel, ageLabel, age, weightLabel, weight, heightLabel, feet, inches, activeLabel, rsltLabel,commentLabel;
    private Font f1, f2, f3, f4;
    private JPanel panel1, panel2;
    private JRadioButton active1, active2, active3, active4;
    private ButtonGroup grp2;
    private JTextField sexField, ageField, weightField, feetField, inchField, rsltField;
    private JButton btn;

    BMR_Calculation() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(400, 100, 1200, 900);
        setTitle("BMR Calculator");
        setResizable(false);

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        icon = new ImageIcon(getClass().getResource("bmr_calculator.png"));
        this.setIconImage(icon.getImage());

        jl1 = new JLabel();
        jl1.setOpaque(true);
        jl1.setBackground(Color.BLUE);
        jl1.setBounds(0, 0, 1200, 20);
        c.add(jl1);

        jl1 = new JLabel();
        jl1.setOpaque(true);
        jl1.setBackground(Color.BLUE);
        jl1.setBounds(0, 0, 20, 900);
        c.add(jl1);

        jl1 = new JLabel();
        jl1.setOpaque(true);
        jl1.setBackground(Color.BLUE);
        jl1.setBounds(1174, 0, 20, 900);
        c.add(jl1);

        jl1 = new JLabel();
        jl1.setOpaque(true);
        jl1.setBackground(Color.BLUE);
        jl1.setBounds(0, 840, 1200, 20);
        c.add(jl1);

        f1 = new Font("Georgia Pro Black", Font.BOLD, 35);
        f2 = new Font("Arial", Font.BOLD, 35);
        f3 = new Font("Arial", Font.PLAIN, 30);
        f4 = new Font("Arial", Font.PLAIN, 25);

        titleLabel = new JLabel("Calculate your Basal Metabolic Rate");
        titleLabel.setFont(f1);
        titleLabel.setBounds(150, 50, 900, 90);
        titleLabel.setForeground(Color.BLUE);
        c.add(titleLabel);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(133, 153, 940, 580);
        c.add(panel2);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(130, 150, 946, 586);
        panel1.setBackground(Color.DARK_GRAY);
        c.add(panel1);

        sexLabel = new JLabel("Sex :");
        sexLabel.setBounds(40, 42, 90, 30);
        sexLabel.setForeground(Color.BLUE);
        sexLabel.setFont(f2);
        panel2.add(sexLabel);

        sexField = new JTextField();
        sexField.setBounds(150, 37, 200, 60);
        sexField.setHorizontalAlignment(JTextField.CENTER);
        sexField.setFont(f3);
        panel2.add(sexField);

        /*grp1 = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(150, 25, 120, 70);
        male.setFont(f3);
        panel2.add(male);

        female = new JRadioButton("Female");
        female.setBounds(300, 25, 150, 70);
        female.setFont(f3);
        panel2.add(female);

        grp1.add(male);
        grp1.add(female);*/
        
        ageLabel = new JLabel("Age :");
        ageLabel.setBounds(40, 125, 90, 40);
        ageLabel.setForeground(Color.BLUE);
        ageLabel.setFont(f2);
        panel2.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(150, 120, 200, 60);
        ageField.setHorizontalAlignment(JTextField.CENTER);
        ageField.setFont(f3);
        panel2.add(ageField);

        age = new JLabel("years");
        age.setBounds(365, 120, 100, 50);
        age.setFont(f4);
        panel2.add(age);

        weightLabel = new JLabel("Weight :");
        weightLabel.setBounds(480, 120, 150, 40);
        weightLabel.setForeground(Color.BLUE);
        weightLabel.setFont(f2);
        panel2.add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(650, 120, 200, 60);
        weightField.setHorizontalAlignment(JTextField.CENTER);
        weightField.setFont(f3);
        panel2.add(weightField);

        age = new JLabel("kg");
        age.setBounds(870, 120, 100, 50);
        age.setFont(f4);
        panel2.add(age);

        heightLabel = new JLabel("Height :");
        heightLabel.setBounds(40, 220, 150, 40);
        heightLabel.setForeground(Color.BLUE);
        heightLabel.setFont(f2);
        panel2.add(heightLabel);

        feetField = new JTextField();
        feetField.setBounds(190, 220, 200, 60);
        feetField.setHorizontalAlignment(JTextField.CENTER);
        feetField.setFont(f3);
        panel2.add(feetField);

        feet = new JLabel("feet");
        feet.setBounds(405, 220, 100, 50);
        feet.setFont(f4);
        panel2.add(feet);

        inchField = new JTextField();
        inchField.setBounds(500, 220, 200, 60);
        inchField.setHorizontalAlignment(JTextField.CENTER);
        inchField.setFont(f3);
        panel2.add(inchField);

        inches = new JLabel("inches");
        inches.setBounds(715, 220, 100, 50);
        inches.setFont(f4);
        panel2.add(inches);

        grp2 = new ButtonGroup();

        activeLabel = new JLabel("How active are you ?");
        activeLabel.setBounds(40, 320, 500, 40);
        activeLabel.setForeground(Color.BLUE);
        activeLabel.setFont(f2);
        panel2.add(activeLabel);

        active1 = new JRadioButton("Sedentary");
        active1.setBounds(40, 382, 180, 70);
        active1.setFont(f3);
        panel2.add(active1);

        active2 = new JRadioButton("Light Activity");
        active2.setBounds(230, 382, 220, 70);
        active2.setFont(f3);
        panel2.add(active2);

        active3 = new JRadioButton("Moderate Activity");
        active3.setBounds(460, 382, 280, 70);
        active3.setFont(f3);
        panel2.add(active3);

        active4 = new JRadioButton("Very Active");
        active4.setBounds(740, 382, 280, 70);
        active4.setFont(f3);
        panel2.add(active4);

        grp2.add(active1);
        grp2.add(active2);
        grp2.add(active3);
        grp2.add(active4);

        img = new ImageIcon(getClass().getResource("calculate 1.png"));
        Image img1 = img.getImage();
        Image newImage = img1.getScaledInstance(200, 65, Image.SCALE_SMOOTH);
        img = new ImageIcon(newImage);

        btn = new JButton(img);
        btn.setBounds(380, 490, 200, 65);
        panel2.add(btn);

        rsltLabel = new JLabel(" You  have  a  BMR  of  _ ");
        rsltLabel.setBounds(500, 750, 600, 70);
        rsltLabel.setFont(f4);
        c.add(rsltLabel);
        
        commentLabel = new JLabel();
        commentLabel.setBounds(930, 750, 240, 70);
        commentLabel.setFont(f4);
        c.add(commentLabel);

        Handler handler = new Handler();
        btn.addActionListener(handler);
        // male.addActionListener(handler);
        //female.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

           // if () {
                
                commentLabel.setText("");
                double feet, inch, kilogram,year;
                double height, bmr;
                
                try{
                    feet = Double.parseDouble(feetField.getText());
                    inch = Double.parseDouble(inchField.getText());
                    kilogram = Double.parseDouble(weightField.getText());
                    year = Double.parseDouble(ageField.getText());
                    
                    height = feet * 30.48;
                    height = height + (inch * 2.54);
                    bmr = 66 + (13.7 * kilogram) + (5 * height) - (6.8 * year);
                    
                    rsltLabel.setText("You have a BMR of " + new DecimalFormat("00.00").format(bmr) + " . ");
                } catch (Exception e) {
                    
                    rsltField.setText("");
                    commentLabel.setText("Please check required textfield .");
                    
                }
           // }
            
            /*else if (sexField.getText() == "Female") {
                double feet, inch, kilogram,year;
                double height, bmr;
                
                try{
                    feet = Double.parseDouble(feetField.getText());
                    inch = Double.parseDouble(inchField.getText());
                    kilogram = Double.parseDouble(weightField.getText());
                    year = Double.parseDouble(ageField.getText());
                    
                    height = feet * 30.48;
                    height = height + (inch * 2.54);
                    bmr = 655 + (9.6 * kilogram) + (1.8 * height) - (4.7 * year);
                    
                    rsltField.setText("You have a BMR of " + new DecimalFormat("00.00").format(bmr) + " . ");
                } catch (Exception e) {
                    
                    rsltField.setText("Please check required textfield .");
                    
                }
            }*/
            
        }

    }

    public static void main(String[] args) {

        BMR_Calculation bmr = new BMR_Calculation();
        bmr.setVisible(true);

    }

}




