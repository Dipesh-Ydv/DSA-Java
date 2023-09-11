package com.dipesh.awtpractice;

import java.awt.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame f = new Frame("First Desktop App");

        TextField textField = new TextField();
        Button button = new Button("Summit");
        Label label = new Label("Employee Id :");

        //  Setting position of the components in the frame
        label.setBounds(40, 80, 120, 30);
        textField.setBounds(40, 110, 120, 30);
        button.setBounds(160,110, 80, 30 );

        // Adding components into frame
        f.add(label);
        f.add(textField);
        f.add(button);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
