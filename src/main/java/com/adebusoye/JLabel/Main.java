package com.adebusoye.JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

// JLabel = a GUI display area for a string of text, an image or both
public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src\\" +
                "main\\java\\com\\adebusoye\\JLabel\\channel-5.jpeg");
//
        Border border =BorderFactory.createLineBorder(Color.green,3);
        JLabel label = new JLabel(); // create a label
        label.setText("Toheeb loves coding"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER
        // label.setForeground(new Color(0x00FF00)); // set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(-2);// set gap of text to image
        label.setBackground(Color.black); // set background color
          label.setOpaque(true); // display background color
         label.setBorder(border);
//        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
//        label.setHorizontalTextPosition(JLabel.CENTER); // set horizontal position of icon+text within label
       label.setBounds(100,100,350,350); // set x,y position within frame as well as dimensions




        JFrame frame = new JFrame(); // creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
         frame.setSize(500,500);

   // frame.setLayout(null);
         frame.setVisible(true);
         frame.add(label);
//
        frame.pack();
    }
}
