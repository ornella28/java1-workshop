package se.lexicon;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class calculatorGUI {

    public static void main(String[] args) {

// creates a frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
// creates a field for number 1
        JTextField number1Field = new JTextField();
        number1Field.setBounds(40,20,100,50);// otherwise the frame will be visible but nothing inside
        frame.add(number1Field);
// field for number 2, position it
        JTextField number2Field = new JTextField();
        number2Field.setBounds(150,20,100,50); //setBounds helps make the fields visible
        frame.add(number2Field);
//label
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50,130,250,25);
        frame.add(resultLabel);

        JButton additionButton = new JButton("+");
        additionButton.setBounds(30,70,50,25);
        frame.add(additionButton);

        JButton subtractionButton = new JButton("-");
        subtractionButton.setBounds(90,70,50,25);
        frame.add(subtractionButton);

        JButton multiplicationButton = new JButton("*");
        multiplicationButton.setBounds(150,70,50,25);
        frame.add(multiplicationButton);

        JButton divisionButton = new JButton("/");
        divisionButton.setBounds(210,70,50,25);
        frame.add(divisionButton);




        additionButton.addActionListener(new ActionListener() { // this will perform additions and put result in result
            @Override
            public void actionPerformed(ActionEvent e) {
                try { // bo not crash if i enter invalid number
                double a = Double.parseDouble(number1Field.getText());
                double b = Double.parseDouble(number2Field.getText());
                resultLabel.setText("Result:" + (a + b));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");}
            }
        });

        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try { // will try the code but do not crash if it fails
                double a = Double.parseDouble(number1Field.getText());
                double b = Double.parseDouble(number2Field.getText());
                resultLabel.setText("Result:" + (a - b));
                }  catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");}
            }
        });

        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double a = Double.parseDouble(number1Field.getText());
                double b = Double.parseDouble(number2Field.getText());
                resultLabel.setText("Result:" + (a / b));
                }   catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double a = Double.parseDouble(number1Field.getText());
                double b = Double.parseDouble(number2Field.getText());
                resultLabel.setText("Result:" + (a * b));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });


        frame.setVisible(true); // we are able to see the frame

    }
}


