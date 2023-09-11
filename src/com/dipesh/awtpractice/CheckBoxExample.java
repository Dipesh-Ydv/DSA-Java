package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExample {
    public static void main(String[] args) {
        Frame frame = new Frame("CheckBox");

        final Label label = new Label();

        label.setAlignment(Label.CENTER);
        // width has to be equal to the frame width to center perfectly
        label.setSize(300, 100);

        Checkbox cpp = new Checkbox("C++");
        cpp.setBounds(100, 100, 80, 30);
        Checkbox java = new Checkbox("Java");
        java.setBounds(100, 140, 80, 30);

        frame.add(label);
        frame.add(cpp);
        frame.add(java);

        cpp.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ checkbox: " + (e.getStateChange() == ItemEvent.SELECTED ? "Checked": "Unchecked"));
            }
        });

        java.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java checkbox: " + (e.getStateChange() == ItemEvent.SELECTED ? "Checked": "Unchecked"));
            }
        });

        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
