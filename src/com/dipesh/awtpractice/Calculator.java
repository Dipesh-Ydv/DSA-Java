package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void main(String[] args) {
        new CalculatorDesign();
    }

    static class CalculatorDesign extends Frame implements ActionListener {
        Button add, sub, multi, divide;

        TextField firstNumber, secondNumber;
        Label ans;

        CalculatorDesign() {

            add = new Button("+");
            sub = new Button("-");
            multi = new Button("x");
            divide = new Button("/");

            firstNumber = new TextField();
            secondNumber = new TextField();

            ans = new Label();

            firstNumber.setBounds(150, 50, 80, 30);
            secondNumber.setBounds(245, 50, 80, 30);

            add.setBounds(150, 90, 40, 30);
            sub.setBounds(195, 90, 40, 30);
            multi.setBounds(240, 90, 40, 30);
            divide.setBounds(285, 90, 40, 30);

            ans.setBounds(225, 120, 160, 30);

            add(firstNumber);
            add(secondNumber);
            add(add);
            add(sub);
            add(multi);
            add(divide);
            add(ans);

            add.addActionListener(this);
            sub.addActionListener(this);
            multi.addActionListener(this);
            divide.addActionListener(this);

            setTitle("Calculator");
            setSize(460, 200);
            setLayout(null);
            setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = firstNumber.getText();
            String s2 = secondNumber.getText();

            float a = Float.parseFloat(s1);
            float b = Float.parseFloat(s2);

            float c = 0;

            if (e.getSource() == add) {
                c = a + b;
            } else if (e.getSource() == sub) {
                c = a - b;
            } else if (e.getSource() == multi) {
                c = a * b;
            } else if(e.getSource() == divide) {
                c = a / b;
            }

            String result = String.valueOf(c);

            ans.setText(result);
        }


    }
}
