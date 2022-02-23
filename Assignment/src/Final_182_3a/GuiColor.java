package Final_182_3a;

import java.awt.Color;

import javax.swing.*;

public class GuiColor {

	public static void main(String[] args) {
		JFrame f = new JFrame("My Frame");
		f.setSize(250, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		// Jpanel p= f.getContainerPanel();
		JPanel p = new JPanel();
		p.setBackground(Color.cyan);

		JButton b = new JButton("click me!");
		b.setBackground(Color.RED);
		b.setForeground(Color.BLUE);
		p.add(b);
		f.add(p);
		f.setVisible(true);
	}

}
