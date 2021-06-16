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

public class Diseases extends JFrame implements ActionListener {

    private Container c;
    private JPanel panel1, panel2;
    private ImageIcon img;
    private Font f1, f2,f3;
    private GridLayout gLayout;
    private JScrollPane scroll;
    private Color Color;
    private JButton btn[],btn1,btn2;
    private JTextField tf1, tf2;

    Diseases() {

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

        f1 = new Font("Arial", Font.PLAIN, 35);
        f2 = new Font("Arial", Font.PLAIN, 20);
        f3 = new Font("Arial",Font.BOLD,14);

        img = new ImageIcon(getClass().getResource("disease.jpg"));
        this.setIconImage(img.getImage());

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

        btn[0] = new JButton("Gastric");
        btn[0].setBackground(Color.CYAN);
        btn[0].setToolTipText("Gastric");
        btn[1] = new JButton("Diabetes");
        btn[1].setBackground(Color.WHITE);
        btn[1].setToolTipText("Diabetes");
        btn[2] = new JButton("Stroke");
        btn[2].setBackground(Color.CYAN);
        btn[2].setToolTipText("Stroke");
        btn[3] = new JButton("Heart Disease");
        btn[3].setBackground(Color.WHITE);
        btn[3].setToolTipText("Heart Disease");
        btn[4] = new JButton(" High BP");
        btn[4].setBackground(Color.CYAN);
        btn[4].setToolTipText("High BP");
        btn[5] = new JButton("Low BP");
        btn[5].setBackground(Color.WHITE);
        btn[5].setToolTipText("Low BP");
        btn[6] = new JButton("Diarrhea");
        btn[6].setBackground(Color.CYAN);
        btn[6].setToolTipText("Diarrhea");
        btn[7] = new JButton("Pneumonia");
        btn[7].setBackground(Color.WHITE);
        btn[7].setToolTipText("Pneumonia");
        btn[8] = new JButton("Tuberculosis ");
        btn[8].setBackground(Color.CYAN);
        btn[8].setToolTipText("Tuberculosis");

        for (int i = 0; i < 9; i++) {
            btn[i].setFont(f1);
            panel1.add(btn[i]);
        }

        for (int i = 0; i < 9; i++) {
            btn[i].addActionListener(this);
        }

        tf1.addActionListener(this);
        tf2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btn[0]) {
            Gastric gas = new Gastric();
            gas.setVisible(true);
        } else if (ae.getSource() == btn[1]) {
            Diabetes db = new Diabetes();
            db.setVisible(true);
        } else if (ae.getSource() == btn[2]) {
            Stroke st = new Stroke();
            st.setVisible(true);
        } else if (ae.getSource() == btn[3]) {
            HeartDisease hd = new HeartDisease();
            hd.setVisible(true);
        } else if (ae.getSource() == btn[4]) {
            High_BP hp = new High_BP();
            hp.setVisible(true);
        } else if (ae.getSource() == btn[5]) {
            Low_BP lp = new Low_BP();
            lp.setVisible(true);
        } else if (ae.getSource() == btn[6]) {
            Diarrhea dr = new Diarrhea();
            dr.setVisible(true);
        } else if (ae.getSource() == btn[7]) {
            Pneumonia pm = new Pneumonia();
            pm.setVisible(true);
        } else if (ae.getSource() == btn[8]) {
            Tuberculosis tb = new Tuberculosis();
            tb.setVisible(true);
        }

    }

    public static void main(String[] args) {

        Diseases diseases = new Diseases();
        diseases.setVisible(true);

    }

}