package Previous_Final_183_3no;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class USDollarToEuro extends JFrame {

	/*
	 */
	private static final long serialVersionUID = 1L;
	private String usdText;
	private boolean error;

	public USDollarToEuro() {
		super("US Dollar to Euro Converter");
		init();
	}

	private void init() {
		setLayout(null);
		setBounds(400, 150, 340, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	//	Font font = new Font(null, Font.PLAIN, 20);

		JTextField usDollar = new JTextField();
		usDollar.setBounds(15, 30, 160, 35);
	//	usDollar.setFont(font);
		usDollar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (error) {
					usDollar.setForeground(Color.BLACK);
					usDollar.setText(usdText);
					error = false;
				}
			}
		});

		JLabel usd = new JLabel("USD");
		usd.setBounds(200, 30, 150, 30);
	//	usd.setFont(font);

		JTextField euro = new JTextField();
		euro.setEditable(false);
		euro.setBounds(15, 235, 160, 35);
		euro.setBackground(usDollar.getBackground());
	//	euro.setFont(font);
		euro.setBorder(BorderFactory.createLineBorder(new Color(130, 130, 130)));

		JLabel eur = new JLabel("Euro");
		eur.setBounds(200, 235, 150, 30);
//		eur.setFont(font);

		JButton convert = new JButton("Convert");
		convert.setBounds(15, 124, 160, 35);
		convert.setBackground(new Color(230, 230, 230));
		convert.setHorizontalAlignment(JButton.CENTER);
	//	convert.setFont(font);
		convert.setFocusPainted(false);
		convert.addActionListener(e -> {
			try {
				double usdValue = Double.parseDouble(usDollar.getText());
				euro.setText("%.2f".formatted(usdValue * 0.88));
			} catch (NumberFormatException ex) {
				error = true;
				usDollar.setForeground(Color.RED);
				usdText = usDollar.getText();
				usDollar.setText("Invalid Number");
			}
		});

		add(usDollar);
		add(usd);
		add(convert);
		add(euro);
		add(eur);
		setVisible(true);
	}

	public static void main(String[] args) {
		new USDollarToEuro();
	}
}
