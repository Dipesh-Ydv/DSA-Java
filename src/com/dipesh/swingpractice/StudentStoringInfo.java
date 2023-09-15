package com.dipesh.swingpractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class StudentStoringInfo {
    public static void StudentInfo() {
        JFrame frame = new JFrame("Student Details Form");

        JLabel l1, l2, l3, l4, l5;
        JTextField t1, t2, t3;
        JComboBox c1, c2;
        JButton b1, b2;

        l1 = new JLabel("Student Name:");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Section:");
        l2.setBounds(420, 50, 70, 30);
        l3 = new JLabel("College Email ID:");
        l3.setBounds(50, 120, 120, 30);
        l4 = new JLabel("Mobile No:");
        l4.setBounds(420, 120, 70, 30);
        l5 = new JLabel("Branch:");
        l5.setBounds(50, 190, 50, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);
        t2 = new JTextField();
        t2.setBounds(160, 120, 150, 30);
        t3 = new JTextField();
        t3.setBounds(490, 120, 150, 30);

        String[] s1 = { "  ", "CSE", "ECE", "EEE", "CIVIL", "MEC", "Others" };
        String[] s2 = { "  ", "Section-A", "Section-B", "Section-C", "Section-D", "Section-E" };

        c1 = new JComboBox<>(s1);
        c1.setBounds(120, 190, 100, 30);
        c2 = new JComboBox<>(s2);
        c2.setBounds(470, 50, 140, 30);

        b1 = new JButton("Save");
        b1.setBounds(150, 300, 70, 30);
        b2 = new JButton("close");
        b2.setBounds(420, 300, 70, 30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String email = t2.getText();
                String mobile = t3.getText();
                String section = c1.getSelectedItem() + "";
                String branch = c2.getSelectedItem() + "";

                try {
                    FileWriter fw = new FileWriter("StudentInfo.txt", true);
                    fw.write(name + "\n");
                    fw.write(email + "\n");
                    fw.write(mobile + "\n");
                    fw.write(section + "\n");
                    fw.write(branch + "\n");
                    fw.close();

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

                JOptionPane.showMessageDialog(frame, "Successfully Saved The Details");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(c1);
        frame.add(c2);
        frame.add(b1);
        frame.add(b2);

        frame.setLayout(null);
        frame.setSize(700, 600);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        StudentInfo();
    }
}
