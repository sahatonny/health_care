package javaproject;

import java.awt.CardLayout;
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

public class SlideShow extends JFrame implements ActionListener{

    private Container c;
    private JLabel label1, label2, label3;
    private JPanel panel1;
    private Font f1, f2, f3;
    private CardLayout card;
    private JButton prevButton, nextButton;
    private ImageIcon img;

    SlideShow() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(400, 90, 1000, 850);
        setTitle("SlideShow");

        initComponents();
        showImage();

    }

    private void showImage() {

        String[] imageNames = {"slideshow 1.jpg", "slideshow 2.jpeg", "slideshow 3.jpg", "slideshow 4.jpg", "slideshow 5.jpg", "slideshow 6.jpg", "slideshow 7.jpg", "slideshow 8.jpg", "slideshow 9.jpg", "slideshow 10.jpg", "slideshow 11.jpg", "slideshow 12.jpg", "slideshow 13.jpg", "slideshow 14.png", "slideshow 15.jpg", "slideshow 16.jpg", "slideshow 17.png", "slideshow 18.png","slideshow 19.jpg", "slideshow 20.jpg", "slideshow 21.jpg", "slideshow 22.jpg", "slideshow 23.jpg", "slideshow 24.jpg", "slideshow 25.jpg", "slideshow 26.jpg", "slideshow 27.jpg", "slideshow 28.jpg", "slideshow 29.jpg", "slideshow 30.jpg"};

        for (String n : imageNames) {

            img = new ImageIcon("src/Image/" + n);

            //resizing the image
            Image img1 = img.getImage();
            Image newImage = img1.getScaledInstance(panel1.getWidth(), panel1.getHeight(), Image.SCALE_SMOOTH);
            img = new ImageIcon(newImage);

            label3 = new JLabel(img);
            panel1.add(label3);

        }

    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        f1 = new Font("Arial", Font.PLAIN, 30);
        f2 = new Font("Arial", Font.PLAIN, 55);
        f3 = new Font("Arial", Font.PLAIN, 20);

        label1 = new JLabel("atch slideslow for a better view and eye relief !");
        label1.setBounds(225, 30, 800, 80);
        label1.setForeground(Color.red);
        label1.setFont(f1);
        c.add(label1);

        label2 = new JLabel("W");
        label2.setBounds(175, 30, 60, 80);
        label2.setForeground(Color.red);
        label2.setFont(f2);
        c.add(label2);

        card = new CardLayout();

        panel1 = new JPanel(card);
        panel1.setBounds(50, 140, 885, 500);
        c.add(panel1);

        prevButton = new JButton("Previous");
        prevButton.setBounds(50, 690, 170, 70);
        prevButton.setFont(f1);
        c.add(prevButton);

        nextButton = new JButton("Next");
        nextButton.setBounds(772, 690, 170, 70);
        nextButton.setFont(f1);
        c.add(nextButton);
        
        prevButton.addActionListener(this);
        nextButton.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource() == prevButton){
            
            card.previous(panel1);
            
        }else if(ae.getSource() == nextButton){
            
            card.next(panel1);
            
        }
        
    }

    public static void main(String[] args) {

        SlideShow ss = new SlideShow();
        ss.setVisible(true);

    }

    
}