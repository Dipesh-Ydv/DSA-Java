package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BouncingBallAnimation {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 400);
        f.setVisible(true);
    }
    static class MyFrame extends Frame implements Runnable {
        int x, y, tx, ty;

        MyFrame() {
            super("Bouncing Ball");

            x = y = 100;
            tx = ty = 1;

            Thread t = new Thread(this);
            t.start();

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }

        @Override
        public void paint(Graphics g) {
            g.setColor(Color.RED);
            g.fillOval(x, y, 50, 50);
        }

        @Override
        public void run() {
            while (true) {
                x += tx;
                y += ty;

                if (x < 0 || x > 450) {
                    tx *= -1;
                }
                if (y < 30 || y > 350) {
                    ty *= -1;
                }
                // repainting the ball again
                repaint();

                // slowing the speed of the ball
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
