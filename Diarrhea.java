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

public class Diarrhea extends JFrame{
 
    private Container c;
    private ImageIcon icon;
     private JTabbedPane tp;
    private Font f1,f2;
    private JPanel panel1, panel2, panel3, panel4, panel5;
     private JLabel label1, label2;
    private JTextArea ta;

    Diarrhea() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Diarrhea");
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
        
        label1 = new JLabel("What Causes Diarrhea?");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        label1 = new JLabel("* Alcohol abuse");
        label1.setBounds(50, 110, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Allergies to certain foods ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Diabetes");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Laxative abuse");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Eating foods that upset the digestive system");
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
        panel1.add(label1);
        
        label1 = new JLabel("* Food poisoning");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        
        label1 = new JLabel("* Drinking of polluted water");
        label1.setBounds(50, 560, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Bacterial,viral,protozoal,helmenthic infection");
        label1.setBounds(50, 610, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("* Gastroenterities");
        label1.setBounds(50, 660, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        
        label1 = new JLabel("What are the symptoms ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);
        
        label1 = new JLabel(" of Diarrhea? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);

        label1 = new JLabel("* Abdominal cramps");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Abdominal pains ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Urgency to go to the toilet");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Frequent passing of loose, watery faeces ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Nausea ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Vomiting ");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Headache,fatigue,temperature");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("What are the diagnosis ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);
        
        label1 = new JLabel(" of Diarrhea? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);

        label1 = new JLabel("* Low temperature or hypothermia");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
         label1 = new JLabel("* Dehydration of different grade");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        

        label1 = new JLabel("* Blood tests ");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Hydrogen breadth tests ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Stool test ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Fasting tests ");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* Medical and physical history");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* Physical examination");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        
        label1 = new JLabel("What are the treatment ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);
        
        label1 = new JLabel(" of Diarrhea? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);

        label1 = new JLabel("* Plenty of fluids to prevent dehydration ");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Oral rehydration drinks to replace lost salts and minerals ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Intravenous replacement of fluids in severe cases");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Medications such as antibiotics and anti-nausea drugs ");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Anti-diarrhoeal medications, but only on the advice of your doctor ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Treatment for any underlying condition, such as inflammatory bowel disease");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Diagnosis of dehydration");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        


    }

    public static void main(String[] args) {
        Diarrhea diarrhea = new Diarrhea();
        diarrhea.setVisible(true);
    }

}