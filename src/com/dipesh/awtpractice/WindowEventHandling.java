package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventHandling {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
    static class MyFrame extends Frame implements WindowListener {

        Label l;
        MyFrame() {
            super("Window Event Handling");

            l = new Label("                                   ");
            setLayout(new FlowLayout());
            add(l);

            addWindowListener(this);
        }

        @Override
        public void windowOpened(WindowEvent e) {
            l.setText("Window Opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            l.setText("Window Closing");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            l.setText("Window Closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            l.setText("Window Iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            l.setText("Window Deiconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            l.setText("Window Activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            l.setText("Window Deactivated");
        }
    }
}
