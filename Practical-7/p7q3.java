import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p7q3 extends JFrame implements ActionListener {
    JTextArea ta = new JTextArea("CHM COLLEGE", 10, 30);
    JCheckBox c1 = new JCheckBox("Bold"), c2 = new JCheckBox("Italic");
    JRadioButton r1 = new JRadioButton("Small"), r2 = new JRadioButton("Medium"), r3 = new JRadioButton("Large");

    public p7q3() {
        ta.setLineWrap(true); 
        ta.setWrapStyleWord(true);
        ButtonGroup bg = new ButtonGroup(); 
        bg.add(r1); bg.add(r2); bg.add(r3);

        JPanel p1 = new JPanel(new GridLayout(2, 1)), p2 = new JPanel();
        p1.add(c1); p1.add(c2); p2.add(r1); p2.add(r2); p2.add(r3);

        setLayout(new FlowLayout());
        add(ta); add(p1); add(p2);
        for (AbstractButton b : new AbstractButton[]{c1, c2, r1, r2, r3}) 
        b.addActionListener(this);

        setSize(700, 400); 
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int style = 0;
        if (c1.isSelected()) style |= Font.BOLD;
        if (c2.isSelected()) style |= Font.ITALIC;

        int size;
        if (r1.isSelected()) {
            size = 16;
        } else if (r2.isSelected()) {
            size = 21;
        } else if (r3.isSelected()) {
            size = 26;
        } else {
            size = 12;
        }

        ta.setFont(new Font("Arial", style, size));
    }

    public static void main(String[] args) { 
        new p7q3(); 
    }
}
