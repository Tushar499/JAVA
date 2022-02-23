package Final_182_3a;

import java.awt.Color;
//import java.awt.event.ActionEvent;

import javax.swing.*;

public class ChangeButtonBackground {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My App");
		frame.setSize(350, 110);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel bigPanel = new JPanel();

		JPanel bottomPanel = new JPanel();

		JLabel label = new JLabel("Are you sure you want to exist? ");

		JButton button1 = new JButton("Exit");
		JButton button2 = new JButton("Cancel");

		bigPanel.add(label);
		bottomPanel.add(button1);
		bottomPanel.add(button2);

		bigPanel.add(bottomPanel);
		bigPanel.setBackground(Color.yellow);
		frame.add(bigPanel);
		frame.setVisible(true);

	}
}