package com.dipesh.awtpractice;

import java.awt.*;
import java.awt.event.*;

public class MenuDemo {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }

    static class MyFrame extends Frame {
         Menu file, sub;
         MenuItem open, close, closeAll;
         CheckboxMenuItem save;
         Label l;

         MyFrame() {
             super("Menu Bar Demo");

             open = new MenuItem("Open");
             close = new MenuItem("Close");
             closeAll = new MenuItem("Close All");
             save = new CheckboxMenuItem("Save");
             l = new Label("                            ");
             file = new Menu("File");
             sub = new Menu("Close");

             setLayout(new FlowLayout());

             file.add(open);
             file.add(sub);
             file.add(save);

             sub.add(close);
             sub.add(closeAll);

             MenuBar br = new MenuBar();
             br.add(file);

             setMenuBar(br);
             add(l);

             save.addItemListener((ItemEvent ie)-> {
                 if(save.getState()) {
                     l.setText("Auto save on");
                 } else {
                     l.setText("Auto save off");
                 }
             });
             open.addActionListener((ActionEvent ae)-> l.setText("Open"));
             close.addActionListener((ActionEvent ae)-> l.setText("Close"));
             closeAll.addActionListener((ActionEvent ae)-> l.setText("Close All"));

             addWindowListener(new WindowAdapter() {
                 @Override
                 public void windowClosing(WindowEvent e) {
                     dispose();
                 }
             });
         }

    }
}
