package com.dipesh.swingpractice;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BorderInSwing {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(600, 400);
        f.setVisible(true);
        // closing the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static class MyFrame extends JFrame {
        JLabel l;
        JTextField tf;
        JButton btn;

        JPanel p;
        MyFrame() {
            l = new JLabel("Name");
            tf = new JTextField(20);
            btn = new JButton("Ok");

            p = new JPanel();

            p.add(l);
            p.add(tf);
            p.add(btn);
            setLayout(new FlowLayout());

            add(p);

            Border br = BorderFactory.createTitledBorder(
                    BorderFactory.createLineBorder(Color.GREEN, 2, true), "Login", TitledBorder.CENTER, TitledBorder.RIGHT);
            p.setBorder(br);
        }
    }
}
