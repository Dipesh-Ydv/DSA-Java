package com.dipesh.swingpractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwing {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        // closing the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class MyFrame extends JFrame implements ActionListener {
        JButton b;
        JLabel l;
        int count = 0;

        MyFrame() {
            b = new JButton("Click");
            l = new JLabel("Count:" + count);

            setLayout(new FlowLayout());

            add(l);
            add(b);

            b.addActionListener(this);

            getRootPane().setDefaultButton(b);
            l.setToolTipText("Counter");
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            l.setText("Clicked " + count + " times");
        }
    }
}
