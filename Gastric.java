package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Gastric extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JTabbedPane tp;
    private JPanel panel1, panel2, panel3, panel4, panel5;
    private Font f1, f2, f3;
    private JLabel label1, label2;
    private JTextArea ta;

    Gastric() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Gastric");
        setBounds(400, 20, 1200, 1000);

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);

        f1 = new Font("Arial", Font.PLAIN, 26);
        f2 = new Font("Arial", Font.BOLD, 32);
        f3 = new Font("Arial", Font.PLAIN, 28);

        icon = new ImageIcon(getClass().getResource("gastric.jpg"));
        this.setIconImage(icon.getImage());

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

        label1 = new JLabel(" What Causes Gastritis?");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        label1 = new JLabel("Gastritis can be caused by irritation due to excessive alcohol use,chronic vomiting,");
        label1.setBounds(50, 110, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("stress, or the use of certain medications such as aspirin or other anti-inflammatory");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("drugs. Infections may be caused by bacteria and viruses.");
        label1.setBounds(50, 209, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("");
        label1.setBounds(50, 275, 1080, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        

   
        
        label1 = new JLabel("What are the symptoms of ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);
        
        label1 = new JLabel(" Gastrics? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);

        label1 = new JLabel("* Nausea or recurrent upset stomach");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Abdominal bloating ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Abdominal pain");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Vomiting");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Burning or gnawing feeling in the stomach between meals or at night");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Indigestion");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        
        label1 = new JLabel("* Hiccups");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        
        label1 = new JLabel("* Loss of appetite");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
       
       label1 = new JLabel("What are the diagnosis ");
        label1.setBounds(30, 20, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);
        
        label1 = new JLabel(" of Gastrics? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);

        label1 = new JLabel("* Upper endoscopy");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("*  Blood tests");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Stool tests");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Tests for H. pylori");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* X-ray of your upper digestive system");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
     
        
       
       label1 = new JLabel("What are the treatment ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);
        
        label1 = new JLabel("for Gastrics? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);

        label1 = new JLabel("* Antibiotic medications to kill H. pylori");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Medications that block acid production and promote healing ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Medications to reduce acid production ");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Antacids that neutralize stomach acid. ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Avoiding hot and spicy foods");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Eliminating irritating foods from your ");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        
        label1 = new JLabel(" diet such as lactose from dairy or gluten from wheat ");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        
        label1 = new JLabel("");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f3);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
    }

    public static void main(String[] args) {
        Gastric gastric = new Gastric();
        gastric.setVisible(true);
    }

}