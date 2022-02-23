package Previous_Final_181_3a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

 class CelsiusToFahrenheit extends JFrame implements ActionListener {
    JTextField Celsius, textFieldFahrenheit;
    JButton Convert;
    public  CelsiusToFahrenheit(){
        super("CtoF Converter");
        setSize(280,150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner sc = new Scanner(System.in);

        add(new JLabel("Enter Celsius Value: "));
        Celsius = new JTextField(10);
        add(Celsius);
        add(new JLabel("C"));

        Convert = new JButton("Convert to Fahrenheit");
        add(Convert);


        add(new JLabel("Fahrenheit Value: "));
        textFieldFahrenheit = new JTextField(10);
        add(textFieldFahrenheit);
        add(new JLabel("F"));

        Convert.addActionListener(this);
        setVisible(true);

    }
    public static void main(String[] args) {
        new CelsiusToFahrenheit();
    }
    public void actionPerformed(ActionEvent e){
        // Fetch the C value from the TextField
        String cVal = Celsius.getText();    
        // convert string val from GUI to numeric
        double cDeg = Double.parseDouble(cVal);
        // calculate the F value from the inputted C val
        double fDeg = (cDeg * 1.80) + 32;
        // Display the Calculate C val
        textFieldFahrenheit.setText(fDeg + "");
    }

}
