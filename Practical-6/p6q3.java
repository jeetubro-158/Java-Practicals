import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p6q3 extends JFrame implements ActionListener {
    JTextField t1, t2;
    JLabel lbl;
    JButton b1, b2, b3, b4;

    public p6q3() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");
        lbl = new JLabel("Result: ");

        t1.setBounds(50, 50, 300, 25);
        t2.setBounds(50, 100, 300, 25);
        b1.setBounds(50, 150, 100, 30);
        b2.setBounds(160, 150, 100, 30);
        b3.setBounds(270, 150, 100, 30);
        b4.setBounds(380, 150, 100, 30);
        lbl.setBounds(50, 200, 400, 25);

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(lbl);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(600, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            JButton b = (JButton) e.getSource();

            if (b == b1) {
                lbl.setText("Result: " + n1 + " + " + n2 + " = " + (n1 + n2));
            } else if (b == b2) {
                lbl.setText("Result: " + n1 + " - " + n2 + " = " + (n1 - n2));
            } else if (b == b3) {
                lbl.setText("Result: " + n1 + " * " + n2 + " = " + (n1 * n2));
            } else if (b == b4) {
                if (n2 == 0) {
                    lbl.setText("Error: Cannot divide by zero");
                } else {
                    lbl.setText("Result: " + n1 + " / " + n2 + " = " + (n1 / n2));
                }
            }
        } catch (NumberFormatException ex) {
            lbl.setText("Error: Please enter valid numbers");
        }
    }

    public static void main(String[] args) {
        p6q3 p=new p6q3();
    }
}
