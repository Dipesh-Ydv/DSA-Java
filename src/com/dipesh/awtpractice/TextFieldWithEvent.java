package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextFieldWithEvent {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }

    static class MyFrame extends Frame {
        Label l1, l2;
        TextField tf;

        MyFrame() {
            super("TextField Example");

            l1 = new Label("No text is entered yet");
            l2 = new Label("Enter Button is not hit yet");
            tf = new TextField(20);

            Handler h = new Handler();
            // registering of listeners
            tf.addActionListener(h);
            tf.addTextListener(h);

            setLayout(new FlowLayout());

            add(l1);
            add(tf);
            add(l2);
        }

        class Handler implements TextListener, ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // changing the label2 text when action is performed
                l2.setText(tf.getText());
            }

            @Override
            public void textValueChanged(TextEvent e) {
                // setting the label1 text same as of entered in textField simultaneously
                l1.setText(tf.getText());
            }
        }
    }
}
