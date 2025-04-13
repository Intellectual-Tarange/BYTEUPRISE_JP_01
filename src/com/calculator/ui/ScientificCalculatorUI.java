package com.calculator.ui;

import com.calculator.logic.CalculatorLogic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculatorUI extends JFrame implements ActionListener {

    JTextField input;
    String operator;
    double num1, num2, result;

    public ScientificCalculatorUI() {
        setTitle("Scientific Calculator");
        setSize(400, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input = new JTextField();
        input.setFont(new Font("Arial", Font.BOLD, 24));
        input.setHorizontalAlignment(JTextField.RIGHT);
        add(input, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 10, 10));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "sin", "cos", "tan", "log",
            "sqrt", "pow", "C", "CE"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "C":
                    input.setText("");
                    break;
                case "CE":
                    if (input.getText().length() > 0) {
                        input.setText(input.getText().substring(0, input.getText().length() - 1));
                    }
                    break;
                case "=":
                    num2 = Double.parseDouble(input.getText());
                    switch (operator) {
                        case "+": result = CalculatorLogic.add(num1, num2); break;
                        case "-": result = CalculatorLogic.subtract(num1, num2); break;
                        case "*": result = CalculatorLogic.multiply(num1, num2); break;
                        case "/": result = CalculatorLogic.divide(num1, num2); break;
                        case "pow": result = CalculatorLogic.power(num1, num2); break;
                    }
                    input.setText("" + result);
                    break;
                case "sin": input.setText("" + CalculatorLogic.sin(Double.parseDouble(input.getText()))); break;
                case "cos": input.setText("" + CalculatorLogic.cos(Double.parseDouble(input.getText()))); break;
                case "tan": input.setText("" + CalculatorLogic.tan(Double.parseDouble(input.getText()))); break;
                case "log": input.setText("" + CalculatorLogic.log(Double.parseDouble(input.getText()))); break;
                case "sqrt": input.setText("" + CalculatorLogic.sqrt(Double.parseDouble(input.getText()))); break;
                default:
                    if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/") || command.equals("pow")) {
                        num1 = Double.parseDouble(input.getText());
                        operator = command;
                        input.setText("");
                    } else {
                        input.setText(input.getText() + command);
                    }
                    break;
            }
        } catch (Exception ex) {
            input.setText("Error");
        }
    }

    public static void main(String[] args) {
        new ScientificCalculatorUI();
    }
}
