package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Painting {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
    static class MyFrame extends Frame {
        int x=0, y=0;

        MyFrame() {
            super("Painting");

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    repaint();
                }
            });
        }

        @Override
        public void paint(Graphics g) {
            g.setColor(Color.RED);
            g.fillOval(x, y, 50, 50);
        }
    }
}
