package com.dipesh.swingpractice;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

public class JTreeComponents {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        // closing the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static class MyFrame extends JFrame implements TreeSelectionListener {
        JTree tree;
        JLabel label;
        MyFrame() {
            super("Tree Demo");

            DefaultMutableTreeNode root = new DefaultMutableTreeNode("/Users/dipeshyadav/Desktop");
            File file = new File("/Users/dipeshyadav/Desktop");

            for (File x : file.listFiles()) {
                if (x.isDirectory()) {
                    DefaultMutableTreeNode subRoot = new DefaultMutableTreeNode(x.getName());
                    for (File y : x.listFiles()) {
                        subRoot.add(new DefaultMutableTreeNode(y.getName()));
                    }
                    root.add(subRoot);
                } else {
                    root.add(new DefaultMutableTreeNode(x.getName()));
                }
            }
            tree = new JTree(root);
            label = new JLabel("No file selected");

            JScrollPane sp = new JScrollPane(tree);

            tree.addTreeSelectionListener(this);

            add(sp, BorderLayout.CENTER);
            add(label, BorderLayout.SOUTH);

        }

        @Override
        public void valueChanged(TreeSelectionEvent e) {
            label.setText(e.getPath().toString());
        }
    }
}
