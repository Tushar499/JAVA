package Online_4;

import javax.swing.*;
import java.awt.*;

public class Problem_2 extends JFrame {
    MyPanel panel;
    Problem_2(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Problem_2();
    }
}
class MyPanel extends JPanel{
    MyPanel(){
        this.setPreferredSize(new Dimension(400,300));
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        //g2D.setStroke(new BasicStroke(5));
        g2D.setColor(Color.red);
        g2D.fillOval(50,30,100,100);
        g2D.setColor(Color.black);
        g2D.drawOval(50,30,100,100);
        g2D.setColor(Color.green);
        g2D.fillRect(200,50,100,100);
        g2D.setColor(Color.black);
        g2D.drawRect(200,50,100,100);
        int[] x = {100,200,100};
        int[] y = {200,200,150};
        g2D.setColor(Color.red);
        g2D.drawPolygon(x,y,3);
        g2D.setColor(Color.blue);
        g2D.fillPolygon(x,y,3);
    }
}
