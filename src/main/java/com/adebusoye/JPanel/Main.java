package com.adebusoye.JPanel;

import javax.swing.*;
import java.awt.*;

// Jpanel = a GUI component that functions as a container to hold other components
public class Main {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src" +
                "\\main\\java\\com\\adebusoye\\JPanel\\channel-5.jpeg");

        label.setText("Hi Toheeb");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
       label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,250,500,250);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);;
        redPanel.setBounds(0,0,250,250);
//        redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);;
        bluePanel.setBounds(250,0,250,250);
//        bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);;
        greenPanel.setBounds(0,250,500,250);
//        greenPanel.setLayout(new BorderLayout());
       // greenPanel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label);
       // redPanel.add(label);
       // bluePanel.add(label);
        frame.setIconImage(icon.getImage());



        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);


    }
}
