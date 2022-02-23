package Final_182_3a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonColor extends JFrame implements ActionListener {
	public JButton m_btn1;
	public Color[] colors = new Color[] { Color.red, Color.green };
	public int index;

	public JButton b2;
	public Color[] colors1 = new Color[] { Color.red, Color.green };
	public int index1;

	public ButtonColor()

	{
		index = 0;
		index1 = 0;

		m_btn1 = new JButton("Button 1");
		m_btn1.addActionListener(this);
		setLayout(new BorderLayout());
		add(m_btn1, BorderLayout.NORTH);

	}

	public void actionPerformed(ActionEvent e)

	{
		if (index < (colors.length - 1)) {
			index++;
		} else {
			index = 0;
		}
		m_btn1.setBackground(colors[index]);
	}

	public static void main(String[] p) {
		ButtonColor thisFrame = new ButtonColor();
		thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisFrame.setSize(200, 200);
		thisFrame.setVisible(true);
	}
}
