package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Tuberculosis extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JTabbedPane tp;
    private Font f1,f2;
    private JPanel panel1, panel2, panel3, panel4, panel5;
     private JLabel label1, label2;
    private JTextArea ta;

    Tuberculosis() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Tuberculosis");
        setBounds(400, 20, 1200, 1000);

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);

        icon = new ImageIcon(getClass().getResource("gastric.jpg"));
        this.setIconImage(icon.getImage());

        f1 = new Font("Arial", Font.PLAIN, 26);
        f2 = new Font("Arial",Font.BOLD,32);

        tp = new JTabbedPane();
        tp.setBounds(10, 10, 1160, 925);
        tp.setFont(f1);
        c.add(tp);

        panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBackground(Color.CYAN);
        panel3.setLayout(null);

        panel4 = new JPanel();
        panel4.setBackground(Color.LIGHT_GRAY);
        panel4.setLayout(null);

        panel5 = new JPanel();
        panel5.setBackground(Color.CYAN);
        panel5.setLayout(null);

        tp.addTab("Causes", panel1);
        tp.addTab("Symptoms", panel2);
        tp.addTab("Diagnosis", panel3);
        tp.addTab("Treatment", panel4);
        tp.addTab("About", panel5);
        
        label1 = new JLabel("  What are the cause");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);
        
        label1 = new JLabel("for Tuberculosis? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        label1 = new JLabel("Tuberculosis is caused by bacteria that spread from person to person through");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("microscopic droplets released into the air. This can happen when someone with the");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("untreated, active form of tuberculosis coughs, speaks, sneezes, spits, laughs or sings");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("Although tuberculosis is contagious, it's not easy to catch.People with TB disease ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("usually have symptoms and may spread TB bacteria toothers. A cough lasting 3 weeks or");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel(" longer is a symptom of TB disease.");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("What are the  symptoms ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);
        
        label1 = new JLabel(" of Tuberculosis? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);

        label1 = new JLabel("* Coughing that lasts three or more weeks.");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Coughing up blood. ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Chest pain, or pain with breathing or coughing.");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Unintentional weight loss. ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Fatigue. ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Fever.");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Night sweats and Chills.");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("What are the diagnosis ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);
        
        label1 = new JLabel(" of Tuberculosis? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);

        label1 = new JLabel("* Blood test for CBC");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Sputum tests for AFB ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Imaging tests");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

       label1 = new JLabel("* Chest X-ray ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* MT ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* TB Hexozen test ");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("What are the treatment ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);
        
        label1 = new JLabel(" of Tuberculosis? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);
        
        label1 = new JLabel("* History ");
        label1.setBounds(50, 120, 450, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Physical examination");
        label1.setBounds(50, 160, 450, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        

        label1 = new JLabel("* Isoniazid");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("*  Rifampin (Rifadin, Rimactane)");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Ethambutol (Myambutol)");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Pyrazinamide ");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Bedaquiline (Sirturo) ");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Linezolid (Zyvox)");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Streptomycin");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        

    }

    public static void main(String[] args) {
        Tuberculosis tuberculosis = new Tuberculosis();
        tuberculosis.setVisible(true);
    }

}