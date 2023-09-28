import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;    
    
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);//puts it in middle

        smile = new ImageIcon("C:\\Users\\zakar\\eclipse-workspace\\newWorkSpace\\ProjectMouseListener\\smile.png");
        nervous = new ImageIcon("C:\\Users\\zakar\\eclipse-workspace\\newWorkSpace\\ProjectMouseListener\\nervous.png");
        pain = new ImageIcon("C:\\Users\\zakar\\eclipse-workspace\\newWorkSpace\\ProjectMouseListener\\pain.png");
        dizzy = new ImageIcon("C:\\Users\\zakar\\eclipse-workspace\\newWorkSpace\\ProjectMouseListener\\dizzy.png");
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        
        label.setIcon(smile);

        this.add(label);
        label.addMouseListener(this);//added mouseListener to LABEL
        //this.addMouseListener(this);//added mouseListener to FRAME


    }


    @Override
    public void mouseClicked(MouseEvent e) {
      System.out.println("I M CLICKED");
      label.setIcon(smile);
    }


    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("I M GETTING PRESSED");
        label.setIcon(pain);
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("YOU ARE RELEASING THE MOUSE");
        label.setIcon(dizzy);
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You ENTERED THE COMPONENT");
        label.setIcon(nervous);
    }


    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("YOU EXITED THE COMPONENT");
        label.setIcon(smile);
    }



    
    
}
