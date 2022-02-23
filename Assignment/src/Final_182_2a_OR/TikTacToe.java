package Final_182_2a_OR;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class TikTacToe {
    TikTacToe(){
        JFrame myframe;
        myframe = new JFrame();
        myframe.setLayout(new BorderLayout());
        myframe.setTitle("Tic-tac-toe");
        myframe.setSize(350,250);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3));
       
        for (int i=0; i<9; i++){
            center.add(new Button());
        }
        JPanel top = new JPanel();
        top.setLayout(new GridLayout());
        JLabel label1 = new JLabel("Player: 1 ");
        JLabel label2 = new JLabel("Player: 2 ");
        JButton button2 = new JButton("Reset");
        top.add(label1);
        top.add(label2);
        top.add(button2);
        myframe.add(top, BorderLayout.NORTH);
        myframe.add(center, BorderLayout.CENTER);
        myframe.setVisible(true);
    }

    public static void main(String[] args) {
        new TikTacToe();
    }
}