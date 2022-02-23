package Previous_Final_183_3no;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Scanner;

	public class Euro {
	    Euro(){
	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        frame.setSize(350,250);
	        JTextField textField1 = new JTextField(10);
	        textField1.setBounds(80,40,120,30);
	        frame.add(textField1);
	        JLabel label1 = new JLabel("USD");
	        label1.setBounds(220,40,60,30);
	        frame.add(label1);
	        JButton button = new JButton("Convert");
	        button.setBounds(80,90,120,35);
	        frame.add(button);
	        JTextField textField2 = new JTextField(10);
	        textField2.setBounds(80,150,120,30);
	        frame.add(textField2);
	        JLabel label2 = new JLabel("Euro");
	        label2.setBounds(220,150,60,30);
	        frame.add(label2);
	        frame.setLayout(null);
	        button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                double a = Double.parseDouble(textField1.getText());
	                double b = (a * 0.88);
	                String s = String.valueOf(b);
	                textField2.setText(s);
	            }
	        });
	    }

	    public static void main(String[] args) {
	        new Euro();
	    }
	}

