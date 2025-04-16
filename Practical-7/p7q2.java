import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p7q2 extends JFrame implements ActionListener {
    JTextField t;
    JPasswordField p;
    public p7q2(){
        t=new JTextField(10);
        p=new JPasswordField(10);
        p.addActionListener(this);
        p.setEchoChar('#');

        setLayout(new FlowLayout());
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(p);
        add(t);
    } 

    public void actionPerformed(ActionEvent e){
        String str=p.getText();
        t.setText(str);
    }

    public static void main(String[] args) {
        new p7q2();
    }
}
