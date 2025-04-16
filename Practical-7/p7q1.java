import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;
import javax.swing.text.DefaultHighlighter.*;

public class p7q1 extends JFrame implements ActionListener {
    JTextArea ta;
    JTextField t;
    JButton b;
    public p7q1(){
        ta=new JTextArea(10, 10);
        ta.setText("Java is high level, general purpose, object oriented programming language\n".repeat(5));
        t=new JTextField(10);
        b=new JButton("Highlight");

        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(ta); add(t); add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String cta=ta.getText();
        String wh=t.getText();
        Highlighter h=ta.getHighlighter();
        h.removeAllHighlights();
        int index=cta.indexOf(wh);
        while (index != -1) {
            try{
                h.addHighlight(index, index+wh.length(), new DefaultHighlightPainter(Color.PINK));
            } catch(Exception ex) {
                System.out.println(ex);
            }
            index=cta.indexOf(wh, index+1);
        }
    }

    public static void main(String[] args) {
        new p7q1();
    }
}
