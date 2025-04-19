import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class p7q4 extends JFrame implements ActionListener, ListSelectionListener {
    JTextArea ta;
    JComboBox<String> c;
    JList<String> list;

    public p7q4() {
        ta = new JTextArea(10, 10);
        String s[] = { "Programming Languages", "Operating System" };
        c = new JComboBox<>(s);
        list = new JList<>();
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.addListSelectionListener(this);

        Panel p1 = new Panel();
        p1.setLayout(new FlowLayout());
        p1.add(c);
        p1.add(list);

        setLayout(new GridLayout(2, 1));
        add(p1);
        add(ta);
        
        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c.addActionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int[] ind = list.getSelectedIndices();
        String sss = "";
        for (int i = 0; i < ind.length; i++) {
            sss += list.getModel().getElementAt(ind[i]) + "\n";
        }
        ta.setText(sss);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = c.getSelectedIndex();
        if (index == 0) {
            String ss[] = { "Java", "Python", "C++", "JS" };
            list.setListData(ss);
        } else if (index == 1) {
            String ss[] = { "Windows", "Linux", "MacOS", "Ubuntu" };
            list.setListData(ss);
        } else {
            list.setListData(new String[0]);
        }
    }

    public static void main(String[] args) {
        new p7q4();
    }
}
