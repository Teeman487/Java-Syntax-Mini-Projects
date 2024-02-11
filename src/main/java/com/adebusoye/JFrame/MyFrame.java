package com.adebusoye.JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    // Constructor
    MyFrame() {

        this.setTitle("JFrame title goes here"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); //prevent
        this.setVisible(true); // make frame visible
        this.setSize(429,420); // sets the x-dimension, and y-dimension of frame


        ImageIcon image = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src" +
                "\\main\\java\\com\\adebusoye\\JFrame\\image\\Arimi Pix.png"); // create an Image Icon
        this.setIconImage(image.getImage()); // change icon of frame
        //frame.getContentPane().setBackground(new Color(255,255,255)); // change color of background
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
