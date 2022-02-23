package Previous_Final_192_2no;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpDownCounter extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField both;
	private JButton upCounter, downCounter, reset;
	private Container c;

	public UpDownCounter() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Counter");
		setBounds(0, 0, 500, 200);
		c = getContentPane();
		c.setLayout(null);
		both = new JTextField("0");
		both.setBounds(200, 5, 100, 50);
		c.add(both);
		upCounter = new JButton("UP");
		upCounter.setBounds(90, 60, 100, 50);
		c.add(upCounter);
		downCounter = new JButton("Down");
		downCounter.setBounds(200, 60, 100, 50);
		c.add(downCounter);
		reset = new JButton("Reset");
		reset.setBounds(310, 60, 100, 50);
		c.add(reset);
// add necessary code here.
		upCounter.addActionListener(new actionHandler());
        downCounter.addActionListener(new actionHandler());
        reset.addActionListener(new actionHandler());
	}

	class actionHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// add necessary code here.

	            if ( e.getSource() == upCounter ){
	                String x = both.getText();
	                if ( Integer.parseInt(x) == 7 ){
	                    both.setText(0+ "");
	                }
	                else {
	                    String y = both.getText();
	                    int a = Integer.parseInt(y);
	                    a++;
	                    both.setText(a+"");
	                }
	            }

	            else  if ( e.getSource() == downCounter ){
	                String x = both.getText();
	                if ( Integer.parseInt(x) == 0 ){
	                    both.setText(7+ "");
	                }
	                else {
	                    String y = both.getText();
	                    int a = Integer.parseInt(y);
	                    a--;
	                    both.setText(a+"");
	                }
	            }

	            else  if ( e.getSource() == reset ){
	                both.setText(0+"");
	            }
	        }

	    }


	public static void main(String[] args) {
		new UpDownCounter();
	}
}
