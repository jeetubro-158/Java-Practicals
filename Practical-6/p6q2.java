import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p6q2 extends JFrame implements ActionListener {
    JPanel p;
    JButton b1, b2, b3;
    public p6q2() {
        p=new JPanel();
        b1=new JButton("RED");
        b2=new JButton("GREEN");
        b3=new JButton("BLUE");
        setSize(600, 500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBounds(50, 50, 500, 300);
        b1.setBounds(50, 450, 100, 125);
        b2.setBounds(200, 450, 100, 125);
        b3.setBounds(350, 450, 100, 125);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(p);
        add(b1);
        add(b2);
        add(b3);
    }

    public void actionPerformed(ActionEvent e){
        JButton b=(JButton)e.getSource();
        if(b == b1) {
            p.setBackground(Color.RED);
        } else if(b == b2) {
            p.setBackground(Color.GREEN);
        } else {
            p.setBackground(Color.BLUE);
        }

    }

    public static void main(String[] args) {
        p6q2 p=new p6q2();
    }
}
