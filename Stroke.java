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

public class Stroke extends JFrame{
    
    private Container c;
    private ImageIcon icon;
    private JTabbedPane tp;
    private Font f1,f2;
    private JPanel panel1, panel2, panel3, panel4, panel5;
     private JLabel label1, label2;
    private JTextArea ta;

    Stroke() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Stroke");
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
        
        
          label1 = new JLabel("What Causes Stroke?");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        /*label1 = new JLabel(" * Male");
        label1.setBounds(50, 110, 1050, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);*/

        label1 = new JLabel("* Drooping on one side of the face or an uneven smile ");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Slurred speech, difficulty speaking, and trouble understanding other speech");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        label1 = new JLabel("* Arm weakness or muscle weakness on one side of the body");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);

        /*label1 = new JLabel("* Female");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel1.add(label1*/
        
        label1 = new JLabel("* Nausea or Vomiting");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Hallucination");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Pain");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* General weakness");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Shortness of breath or trouble breathing");
        label1.setBounds(50, 460, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Fainting or losing consciousness");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Confusion, disorientation, or lack of responsiveness ");
        label1.setBounds(50, 560, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Sudden behavioral changes, especially increased agitation");
        label1.setBounds(50, 610, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
        
        label1 = new JLabel("* Seizures");
        label1.setBounds(50, 660, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel1.add(label1);
      
        
        label1 = new JLabel("There are 4 types of stroke.They are :");
        label1.setBounds(50, 30, 1050, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel5.add(label1);
        
        label1 = new JLabel(" * embolic stroke ");
        label1.setBounds(50, 110, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel5.add(label1);
        
        label1 = new JLabel(" * thrombotic stroke");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel5.add(label1);
        
        label1 = new JLabel(" * intracerebral stroke");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel5.add(label1);
        
        label1 = new JLabel(" * subarachnoid stroke");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel5.add(label1);
        
        
        label1 = new JLabel("What are the symptoms ?");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);
        
        label1 = new JLabel(" of Stroke? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel2.add(label1);

        label1 = new JLabel("* Sudden numbness or weakness in the face, arm, or leg, especially on one side of the body");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Sudden confusion, trouble speaking, or difficulty understanding speech ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Sudden trouble seeing in one or both eyes");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Sudden trouble walking, dizziness, loss of balance, or lack of coordination");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);

        label1 = new JLabel("* Sudden severe headache with no known cause");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Having high blood pressure during pregnancy");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
      
        
        label1 = new JLabel("* Using certain types of birth control medicines, especially if they also smoke");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
        
        label1 = new JLabel("* Having higher rates of depression and anxiety");
        label1.setBounds(50,460,1050,70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel2.add(label1);
 
        
        label1 = new JLabel("What are the diagnosis ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);
        
        label1 = new JLabel("  for Stroke? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel3.add(label1);

        label1 = new JLabel("* Checking blood sugar level ");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Platelet levels ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Checking infections");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* Blood clotting time");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);

        label1 = new JLabel("* MRI and CT scan ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* Echocargiogram");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
      
        
        label1 = new JLabel("* Cerebral angiogram ");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* Carotid ultrasound");
        label1.setBounds(50,460,1050,70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        label1 = new JLabel("* EKG");
        label1.setBounds(50, 510, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel3.add(label1);
        
        
        label1 = new JLabel("What are the treatment ");
        label1.setBounds(30, 30, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);
        
        label1 = new JLabel("  of Stroke? ");
        label1.setBounds(30, 80, 450, 70);
        label1.setFont(f2);
        label1.setForeground(Color.BLACK);
        panel4.add(label1);

        label1 = new JLabel("* Antiplatelet and anticoagulants ");
        label1.setBounds(50, 120, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Mechanical thrombectomy ");
        label1.setBounds(50, 160, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Clot-breaking drugs");
        label1.setBounds(50, 210, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("* Stents");
        label1.setBounds(50, 260, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);

        label1 = new JLabel("*Clamping ");
        label1.setBounds(50, 310, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Medication ");
        label1.setBounds(50, 360, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
      
        
        label1 = new JLabel("* Coiling");
        label1.setBounds(50, 410, 1050, 70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        label1 = new JLabel("* Surgery ");
        label1.setBounds(50,460,1050,70);
        label1.setFont(f1);
        label1.setForeground(Color.WHITE);
        panel4.add(label1);
        
        
        
        
       
        


    }

    public static void main(String[] args) {
        Stroke stroke = new Stroke();
        stroke.setVisible(true);
    }

}