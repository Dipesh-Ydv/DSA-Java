package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListBoxAndChoice {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }

    static class MyFrame extends Frame implements ItemListener, ActionListener {
        List l;
        Choice ch;
        TextArea ta;

        MyFrame() {
            super("Text Box Demo");

            setLayout(new FlowLayout());

            l = new List(4, true);
            ch = new Choice();
            ta = new TextArea(10, 20);

            l.add("Monday");
            l.add("Tuesday");
            l.add("Wednesday");
            l.add("Thursday");
            l.add("Friday");
            l.add("Saturday");
            l.add("Sunday");

            ch.add("January");
            ch.add("February");
            ch.add("March");
            ch.add("April");
            ch.add("May");
            ch.add("June");
            ch.add("July");
            ch.add("August");
            ch.add("September");
            ch.add("October");
            ch.add("November");
            ch.add("December");

            add(l);
            add(ch);
            add(ta);

            l.addItemListener(this);
            l.addActionListener(this);
            ch.addItemListener(this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] items = l.getSelectedItems();
            String str = "";

            for(String x : items) {
                str += x + "\n";
            }
            ta.setText(str);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == l) {
                ta.setText(l.getSelectedItem());
            } else {
                ta.setText(ch.getSelectedItem());
            }
        }
    }
}
