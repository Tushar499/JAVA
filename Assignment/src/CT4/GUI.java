package CT4;

	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class GUI {
	    JFrame j = new JFrame("111 to 222");
	    JButton B;
	    JTextField s1;
	    GUI(){
	        s1= new JTextField("111",10);
	        JPanel p = new JPanel();

	        B = new JButton("OK");
	        B.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                s1.setText((s1.getText().equals("111")? "222":"111"));

	            }
	        });
	        p.add(s1);
	        p.add(B);
	        j.setContentPane(p);
	        j.setSize(300,100);
	        j.setVisible(true);
	        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	    }
	    public static void main(String[] args) {
	        new GUI();
	    }
	}

