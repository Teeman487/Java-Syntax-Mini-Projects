package com.adebusoye.JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src\\main\\java\\com\\adebusoye\\JButton\\img.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src\\main\\java\\com\\adebusoye\\JButton\\img.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(0,150,250,100);
        label.setVisible(true);


        button = new JButton();
        button.setBounds(0, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I'm a button!");
        button.setFocusable(false); // remove the border
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setIconTextGap(1);
        button.setForeground(Color.cyan);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
       //button.setEnabled(false);



       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(null);
       this.setSize(500,500);
       this.setVisible(true);
       this.add(button);
       this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("clicked");
            button.setEnabled(true);
            label.setVisible(true);
        }

    }
}

//public class MyFrame extends JFrame {
//    JButton button;
//    MyFrame(){
//        button = new JButton();
//        button.setBounds(200, 100, 100, 50);
//        button.addActionListener(e -> System.out.println("clicked"));
//
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setSize(500,500);
//        this.setVisible(true);
//        this.add(button);
//    }
//
//
//}