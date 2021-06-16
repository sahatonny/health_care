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

public class HeartDisease extends JFrame{
    private Container c;
    private ImageIcon icon;
     private JTabbedPane tp;
    private Font f1,f2;
    private JPanel panel1, panel2, panel3, panel4, panel5;
     private JLabel label1, label2;
    private JTextArea ta;

    HeartDisease() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Heart Disease");
        setBounds(400, 20, 1200, 1000);

        initComponents();

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

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
        
        
         label1 = new JLabel("What Causes Heart Disease?");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        label1 = new JLabel("* Damage to all or part of the heart");
        label1.setBounds(50, 110, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Damage to the coronary arteries ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* A poor supply of nutrients and oxygen to the organ");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Genetic");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

       /* label1 = new JLabel("* Eating foods that upset the digestive system");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Infection by bacteria");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("* Medications");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("* Diseases of the Intestines");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);*/
        
        label1 = new JLabel("");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
         label1 = new JLabel("What are the symptoms ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);

        
        label1 = new JLabel(" of Heart Disease? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);
        
        label1 = new JLabel("* Fluttering in your chest");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("*  Racing heartbeat (tachycardia)");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Slow heartbeat (bradycardia)");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Chest pain or discomfort ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Shortness of breath");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Lightheadedness");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        
        label1 = new JLabel("* Dizziness");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        
        label1 = new JLabel("* Fainting (syncope) or near fainting ");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Swelling in the legs, abdomen or areas around the eyes");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
       /* label1 = new JLabel("* In an infant, shortness of breath during feedings, leading to poor weight gain");
        label1.setBounds(50, 560, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);*/
        
        label1 = new JLabel("* Fatigue");
        label1.setBounds(50, 560, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Changes in your heart rhythm");
        label1.setBounds(50, 610, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        
       label1 = new JLabel("What are the diagnosis ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);
        
        label1 = new JLabel(" of Heart Disease? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);

        label1 = new JLabel("* Electrocardiogram(ECG)");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Echocardiogram ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Stress test");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("*  Holter monitoring");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Cardiac catherization ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* MRI");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* CT scan");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        
        label1 = new JLabel(" * Cardiac Angigram");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        
        label1 = new JLabel(" * Chest X-ray");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        
        label1 = new JLabel(" * Lipid profile");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        
        label1 = new JLabel("What are the treatment for ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);
        
        label1 = new JLabel("for Heart Disease? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);

        label1 = new JLabel("* Lifestyle change");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Medication ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Maintaining a strict diet");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("*  Excercise regularly");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Medical procedures or surgery ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Palliative care and end-of-life care(in spetial cases");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Maintaining a standard weight ");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        
        label1 = new JLabel(" * Avoid smoking and consumption of alcohol");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        
        label1 = new JLabel(" * Maintaining a low-fat diet");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        
        
        


    }

    public static void main(String[] args) {
        HeartDisease heartDisease = new HeartDisease();
        heartDisease.setVisible(true);
    }

}