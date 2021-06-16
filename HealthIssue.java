package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class HealthIssue extends JFrame implements ActionListener {

    private Container c;
    private JPanel panel1, panel2;
    private JButton btn[],btn1,btn2;
    private ImageIcon img;
    private Font f, f1,f2,f3;
    private GridLayout gLayout;
    private JScrollPane scroll;
    private Color Color;
    private JTextField tf1,tf2;

    HealthIssue() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(460, 20, 1000, 1000);
        setTitle("Health related issues");

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        gLayout = new GridLayout(3, 3, 2, 2);
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        //color = JColorChooser.showDialog(null,"", Color.getRGBColorComponents(33558B));
        f = new Font("Segoe Print", Font.BOLD, 35);
        f1 = new Font("Segoe Print", Font.BOLD, 35);
        f2 = new Font("Arial", Font.PLAIN, 20);
        f3 = new Font("Arial",Font.BOLD,14);

        img = new ImageIcon(getClass().getResource("health 2.png"));
        this.setIconImage(img.getImage());
        
        /* tf1 = new JTextField("Search by disease");
        tf1.setFont(f2);
        tf1.setBounds(7, 5, 485, 30);
        c.add(tf1);

        tf2 = new JTextField("Search by Symptoms");
        tf2.setFont(f2);
        tf2.setBounds(498, 5, 475, 30);
        c.add(tf2);*/
        
        tf1 = new JTextField("Search by disease");
        tf1.setFont(f2);
        tf1.setBounds(7, 5, 380, 30);
        c.add(tf1);
        
        btn1 = new JButton("Search");
        btn1.setFont(f3);
        btn1.setBounds(400,5,90,30);
        c.add(btn1);

        tf2 = new JTextField("Search by Symptoms");
        tf2.setFont(f2);
        tf2.setBounds(498, 5, 380, 30);
        c.add(tf2);
        
        btn2 = new JButton("Search");
        btn2.setFont(f3);
        btn2.setBounds(885,5,90,30);
        c.add(btn2);

        panel1 = new JPanel();
        panel1.setLayout(gLayout);
        panel1.setBackground(Color.BLUE);
        panel1.setBounds(2, 43, 973, 899);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(gLayout);
        panel2.setBounds(0, 40, 1000, 950);
        panel2.setBackground(Color.BLUE);
        c.add(panel2);

        btn = new JButton[9];

        btn[0] = new JButton("BMI-BMR");
        btn[0].setBackground(Color.CYAN);
        btn[0].setToolTipText("BMI-BMR");
        btn[1] = new JButton("Diet Chart");
        btn[1].setBackground(Color.WHITE);
        btn[1].setToolTipText("Diet Chart");
        btn[2] = new JButton("BP Check");
        btn[2].setToolTipText("BP Check");
        btn[2].setBackground(Color.CYAN);
        btn[3] = new JButton(" ");
        btn[3].setBackground(Color.WHITE);
        btn[4] = new JButton(" ");
        btn[4].setBackground(Color.CYAN);
        btn[5] = new JButton(" ");
        btn[5].setBackground(Color.WHITE);
        btn[6] = new JButton(" ");
        btn[6].setBackground(Color.CYAN);
        btn[7] = new JButton(" ");
        btn[7].setBackground(Color.WHITE);
        btn[8] = new JButton(" ");
        btn[8].setBackground(Color.CYAN);

        for (int i = 0; i < 9; i++) {
            btn[i].setFont(f1);
            panel1.add(btn[i]);
        }

        for (int i = 0; i < 9; i++) {
            btn[i].addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btn[0]) {
            BMI_BMR bmiBmr = new BMI_BMR();
            bmiBmr.setVisible(true);
        }

    }

    public static void main(String[] args) {

        HealthIssue health = new HealthIssue();
        health.setVisible(true);

    }

}




