package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceExample {
    public static void main(String[] args) {
        Frame f = new Frame();

        // creating a final object of Label class
        final Label label = new Label();

        // setting alignment and size of label component
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);

        // creating a button
        Button b = new Button("Show");

        // setting the bounds of button
        b.setBounds(220, 100, 50, 35);

        // creating a final object of Choice class
        final Choice c = new Choice();

        c.setBounds(130, 100, 80, 40);

        // adding five items to a choice menu
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("PHP");
        c.add("Android");

        // adding the above components into the frame
        f.add(c);
        f.add(label);
        f.add(b);

        // setting size, layout and visibility of frame
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        // adding event to the button
        // which displays the selected item from the list when the button is clicked
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: "+ c.getItem(c.getSelectedIndex());
                label.setText(data);
            }
        });
    }
}
