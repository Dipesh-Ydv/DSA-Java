package com.dipesh.swingpractice;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.ChoiceFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class SwingFormattedTextField {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static class MyFrame extends JFrame {
        MyFrame() {
            JTextField tf = new JTextField(20);

            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormatter nft = new NumberFormatter(nf);
            nft.setAllowsInvalid(false);
            JFormattedTextField ftf = new JFormattedTextField(nft);
            ftf.setColumns(10);
            nft.setMaximum(10000);
            ftf.setValue(0);

            setLayout(new FlowLayout());
            add(tf);
            add(ftf);
        }
    }
}
