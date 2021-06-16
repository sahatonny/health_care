package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BMI_BMR extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel jl1, jl2, jl3;
    private Font f1, f2, f3;
    private JButton btn3, btn4;
    private Cursor cursor;

    BMI_BMR() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(700, 300, 500, 500);
        setTitle("The Calculator Site");

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f1 = new Font("Calligraphy", Font.BOLD + Font.ITALIC, 18);
        f2 = new Font("Times New Roman", Font.BOLD, 18);
        cursor = new Cursor(Cursor.HAND_CURSOR);

        icon = new ImageIcon(getClass().getResource("bmi_calculator 2.png"));
        this.setIconImage(icon.getImage());

        jl1 = new JLabel();
        jl1.setText("Select the option you want to measure");
        jl1.setBounds(50, 25, 350, 150);
        jl1.setFont(f1);
        c.add(jl1);

        btn3 = new JButton("BMI");
        btn3.setBounds(125, 145, 85, 35);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setToolTipText("Click to calculate BMI");
        c.add(btn3);

        btn4 = new JButton("BMR");
        btn4.setBounds(235, 145, 85, 35);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setToolTipText("Click to calculate BMR");
        c.add(btn4);

        jl2 = new JLabel();
        jl2.setBounds(120, 140, 90, 40);
        jl2.setOpaque(true);
        jl2.setBackground(Color.BLUE);
        c.add(jl2);

        jl3 = new JLabel();
        jl3.setBounds(230, 140, 90, 40);
        jl3.setOpaque(true);
        jl3.setBackground(Color.BLUE);
        c.add(jl3);

        Handler handler = new Handler();

        btn3.addActionListener(handler);
        btn4.addActionListener(handler);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn3) {

                BMI_Calculation Bmi = new BMI_Calculation();
                Bmi.setVisible(true);

            } else {
                BMR_Calculation Bmr = new BMR_Calculation();
                Bmr.setVisible(true);
            }

        }

    }

    public static void main(String[] args) {

        BMI_BMR frame = new BMI_BMR();
        frame.setVisible(true);

    }

}