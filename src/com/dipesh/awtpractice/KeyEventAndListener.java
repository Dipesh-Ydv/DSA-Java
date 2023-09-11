package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

public class KeyEventAndListener {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }

    static class MyFrame extends Frame implements KeyListener {
        Label l1, l2, l3, l4;

        MyFrame() {
            super("Key Event Handling");
            l1 = new Label();
            l2 = new Label();
            l3 = new Label();
            l4 = new Label();

            setLayout(null);

            add(l1);
            add(l2);
            add(l3);
            add(l4);

            l1.setBounds(50, 50, 100, 30);
            l2.setBounds(50, 100, 100, 30);
            l3.setBounds(50, 150, 100, 30);
            l4.setBounds(50, 200, 200, 30);

            addKeyListener(this);
        }

        @Override
        public void keyTyped(KeyEvent e) {
            l1.setText("Key Typed");
            l4.setText(new Date(e.getWhen()) + "");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            l2.setText("Key Pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            l3.setText("Key Released");
        }
    }
}
