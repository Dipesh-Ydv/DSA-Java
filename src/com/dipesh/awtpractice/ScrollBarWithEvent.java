package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarWithEvent {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
    static class MyFrame extends Frame implements AdjustmentListener {

        Scrollbar red;
        Scrollbar green;
        Scrollbar blue;
        TextField tf;

        MyFrame() {
            super("ScrollBar");

            red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
            green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
            blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);

            tf = new TextField(20);
            setLayout(null);

            tf.setBounds(50, 50, 300, 30);
            red.setBounds(50, 100, 300, 30);
            green.setBounds(50, 150, 300, 30);
            blue.setBounds(50, 200, 300, 30);

            add(red);
            add(green);
            add(blue);
            add(tf);

            red.addAdjustmentListener(this);
            green.addAdjustmentListener(this);
            blue.addAdjustmentListener(this);
        }
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
        }
    }
}
