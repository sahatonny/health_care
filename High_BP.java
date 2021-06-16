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

public class High_BP extends JFrame{
    
    private Container c;
    private ImageIcon icon;
     private JTabbedPane tp;
    private Font f1,f2;
    private JPanel panel1, panel2, panel3, panel4, panel5;
     private JLabel label1, label2;
    private JTextArea ta;

    High_BP() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("High Blood Pressure");
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
        
         label1 = new JLabel("What Causes High ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);
        
        label1 = new JLabel(" blood pressure? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        label1 = new JLabel("* Smoking");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Being overweight or obess ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Lack of physical activity");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Stress");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Too much salt in the diet");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Too much alcohol asumption");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("* Older age");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("* Genetics");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Pheochromocytoma");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("* Kidney disease");
        label1.setBounds(50, 560, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("What are the symptoms ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);
        
        label1 = new JLabel(" of High blood prssure? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);

        

        label1 = new JLabel("* Severe headache with vartigo ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Fatigue or confusion");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Blurring of vision ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Chest pain for stress or anxiety ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Difficulty breathing");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Irregular heartbeat");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
         
        label1 = new JLabel("* Blood in the urine");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
         
        label1 = new JLabel("* Pounding in your chest, neck, or ears");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        
       label1 = new JLabel("* Haematuria ");
        label1.setBounds(50, 560, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        
        label1 = new JLabel("What are the diagnosis ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);
        
        label1 = new JLabel(" of High blood pressure? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);

        label1 = new JLabel("* Medical history");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Physical examination ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Blood test");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Urine test ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Cholesterol  test");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* Electrocardiogram(ECG)");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* Echocardiogram ");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* Measuring blood pressure ");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("What are the treatment ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);
        
        label1 = new JLabel(" of High blood pressure? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);

        label1 = new JLabel("* Eating a heart-healthy diet with less salt");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Getting regular physical activity ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Maintaining a healthy weight or losing weight if you're overweight or obese");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Limiting the amount of alcohol you drink  ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

       label1 = new JLabel("* Anti-hypertensive drug ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Treatment of the cause");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        


    }

    public static void main(String[] args) {
        High_BP highBP = new High_BP();
        highBP.setVisible(true);
    }

}