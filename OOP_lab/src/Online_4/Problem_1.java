package Online_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem_1 {
    Problem_1(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,600,500);
        frame.setLayout(null);

        JLabel label = new JLabel("MAGIC WINDOW");
        label.setBounds(200,20,200,40);
        frame.add(label);
        JTextField textField = new JTextField("HI");
        textField.setBounds(200, 70, 200, 50);

        JButton button1 = new JButton("LOWER CASE");
        button1.setBounds(200, 150, 150, 30);

        JButton button2 = new JButton("UPPER CASE");
        button2.setBounds(360, 150, 150, 30);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toLowerCase());
                label.setText("LOWER CASE");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toUpperCase());
                label.setText("UPPER CASE");
            }
        });

        frame.add(textField);
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Problem_1();
    }
}