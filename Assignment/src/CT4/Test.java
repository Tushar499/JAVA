package CT4;


	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	@SuppressWarnings("serial")
	public class Test extends JFrame implements ActionListener{
	JTextField tf;
	JButton b, r;
	public Test(){
	super("111 to 222?"); setSize(300, 100);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(new JLabel());
	tf = new JTextField("111", 10);
	b = new JButton("OK");
	
	add(tf);add(b);
	setVisible(true);
	b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
	Object obj = e.getSource();
	
	if (obj == b)
	tf.setText("222");
	else if (obj == r)
	tf.setText("111");
	}
	
	public static void main(String[] args) { 
		new Test();
		}
	}


