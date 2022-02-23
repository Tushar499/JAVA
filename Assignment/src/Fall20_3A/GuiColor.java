package Fall20_3A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiColor{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ocen");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        String[] ocen = {"Arctic", "North Atlantic","South Atlantic", "Indian", "North pacific","South Pacific","Antaractic"};
        JTextField tf1 = new JTextField(20);
        JTextField td2 = new JTextField(20);
        JButton b1 = new JButton("Show");
        frame.add(tf1);
        frame.add(td2);
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1){
                    td2.setText(ocen[Integer.parseInt(tf1.getText())]);
                }
            }
        });
        frame.setVisible(true);
    }
}