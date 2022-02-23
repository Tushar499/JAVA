package Final_182_1OR_b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChange {
    static  int color = 1 ;
    static  int colour = 1 ;
    ColorChange(){
        JFrame frame = new JFrame();
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button_1");
        frame.add(button1);
        button1.setBackground(Color.red);
        JButton button2 = new JButton("Button_2");
        frame.add(button2);
        button2.setBackground(Color.blue);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( color == 1 ){
                    button1.setBackground(Color.GREEN);
                    color++;
                }
                else {
                    button1.setBackground(Color.RED);
                    color = 1 ;
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( colour == 1 ){
                    button2.setBackground(Color.CYAN);
                    colour++;
                }
                else {
                    button2.setBackground(Color.BLUE);
                    colour = 1 ;
                }
            }
        });
    }

    public static void main(String[] args) {
        new ColorChange();
    }
}

