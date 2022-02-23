package Final_191;

//Problem : 191_5
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class Menu {
    Menu(){
        JFrame myframe;
        myframe = new JFrame();
        myframe.setLayout(new BorderLayout());
        myframe.setTitle("Class Test!!!");
        myframe.setSize(300,300);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3));
        JLabel cell[] = new JLabel[9];
        for (int i=0; i<9; i++){
            cell[i] = new JLabel(""+i);
            center.add(new Button(String.valueOf(i)));
            cell[i].setFont(new Font("Cambria",2,24));
        }
        JPanel top = new JPanel();
        top.setLayout(new GridLayout());
        JButton button1 = new JButton("Change");
        JButton button2 = new JButton("Reset");
        top.add(button1);
        top.add(button2);
        myframe.add(top, BorderLayout.NORTH);
        myframe.add(center, BorderLayout.CENTER);
        myframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}