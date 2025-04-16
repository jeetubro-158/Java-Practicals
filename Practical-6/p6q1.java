import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class p6q1 extends JFrame implements ActionListener {
    JLabel lbl;
    JButton b;
    public p6q1(){
        lbl=new JLabel();
        b=new JButton();
        lbl.setBounds(175, 200, 300, 25);
        b.setBounds(100, 100, 300, 25);
        b.addActionListener(this);
        b.setText("Click Here to change the color...:)");
        setLayout(null);
        setVisible(true);
        setSize(600, 500);
        add(lbl);
        add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        Random rand=new Random();
        int r=rand.nextInt(256);
        int g=rand.nextInt(256);
        int b=rand.nextInt(256);
        Color c=new Color(r, g, b);
        getContentPane().setBackground(c);
        lbl.setText(r + " " + g + " " + b);
    }
    public static void main(String[] args) {
        p6q1 p=new p6q1();
    }
}
