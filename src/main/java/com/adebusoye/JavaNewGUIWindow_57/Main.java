package com.adebusoye.JavaNewGUIWindow_57;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //LaunchPage launchPage = new LaunchPage();
        new LaunchPage();

    }
}
// ********************************************


class LaunchPage extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Toheeb Frame");
    JButton myButton = new JButton("New Window");

    LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(true); // inner border
        myButton.addActionListener(this);

        this.add(myButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==myButton) {
            this.dispose();

            NewWindow myWindow = new NewWindow();
        }
    }


}
// ********************************************

 class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    NewWindow(){

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
