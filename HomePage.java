package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class HomePage extends JFrame implements ActionListener {

    private Container c;
    private JPanel panel1, panel2;
    private ImageIcon img1, icon;
    private JLabel label1, label2, label3;
    private JButton btn1, btn2, btn3;
    private Font f1, f2, f3;
    private JTabbedPane tb;

    HomePage() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Health Care App");
        setBounds(470, 50, 1100, 950);

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        icon = new ImageIcon(getClass().getResource("health care 2.png"));
        this.setIconImage(icon.getImage());

        f1 = new Font("Arial", Font.BOLD, 28);
        f2 = new Font("Arial", Font.BOLD, 30);
        f3 = new Font("Arial", Font.BOLD, 55);

        img1 = new ImageIcon(getClass().getResource("health care 1.jpg"));
        Image img = img1.getImage();
        Image newImage = img.getScaledInstance(960, 500, Image.SCALE_SMOOTH);
        img1 = new ImageIcon(newImage);

        label2 = new JLabel("elcome to the App!");
        label2.setBounds(443, 37, 900, 80);
        label2.setForeground(Color.red);
        label2.setFont(f2);
        c.add(label2);

        label3 = new JLabel("W");
        label3.setBounds(390, 30, 60, 80);
        label3.setForeground(Color.red);
        label3.setFont(f3);
        c.add(label3);
        
       

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(60, 160, 960, 500);
        c.add(panel1);
        
        

        label1 = new JLabel(img1);
        label1.setBounds(0, 0, 960, 500);
        panel1.add(label1);


        /* panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(45, 45, 890, 530);
        panel2.setBackground(Color.BLUE);
        c.add(panel2);*/
        btn1 = new JButton("Disease");
        btn1.setBounds(142, 740, 200, 70);
        // btn1.setBackground(Color.blue);
        // btn1.setForeground(Color.white);
        btn1.setFont(f1);
        c.add(btn1);

        btn2 = new JButton("Health Issue");
        btn2.setBounds(432, 740, 230, 70);
        //btn2.setBackground(Color.blue);
        // btn2.setForeground(Color.white);
        btn2.setFont(f1);
        c.add(btn2);

        btn3 = new JButton("Slideshow");
        btn3.setBounds(742, 740, 200, 70);
        // btn3.setBackground(Color.blue);
        // btn3.setForeground(Color.white);
        btn3.setFont(f1);
        c.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btn1) {

            Diseases ds = new Diseases();
            ds.setVisible(true);

        } else if (ae.getSource() == btn2) {

            HealthIssue hi = new HealthIssue();
            hi.setVisible(true);

        }

        if (ae.getSource() == btn3) {

            SlideShow ss = new SlideShow();
            ss.setVisible(true);

        }

    }

    public static void main(String[] args) {

        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }

}