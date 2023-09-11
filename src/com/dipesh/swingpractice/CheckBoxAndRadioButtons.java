package com.dipesh.swingpractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxAndRadioButtons {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(350, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class MyFrame extends JFrame implements ActionListener {
        JRadioButton r1, r2;
        JCheckBox c1, c2;
        JTextField tf;
        MyFrame() {
            c1 = new JCheckBox("Bold");
            c2 = new JCheckBox("Italic");

            r1 = new JRadioButton("lower");
            r2 = new JRadioButton("UPPER");
            ButtonGroup bg = new ButtonGroup();
            bg.add(r1);
            bg.add(r2);

            tf = new JTextField("Dipesh Yadav", 15);

            setLayout(new FlowLayout());
            add(tf);
            add(c1);
            add(c2);
            add(r1);
            add(r2);

//            r1.setActionCommand("lower");
//            r2.setActionCommand("UPPER");
            r1.addActionListener(this);
            r2.addActionListener(this);
            c1.addActionListener(this);
            c2.addActionListener(this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "lower" -> tf.setText(tf.getText().toLowerCase());
                case "UPPER" -> tf.setText(tf.getText().toUpperCase());
            }
            int b = 0;
            int i = 0;

            if (c1.isSelected()) b = Font.BOLD;
            if (c2.isSelected()) i = Font.ITALIC;

            Font f = new Font("Times New Roman", b | i, 20);

            tf.setFont(f);
        }
    }
}
