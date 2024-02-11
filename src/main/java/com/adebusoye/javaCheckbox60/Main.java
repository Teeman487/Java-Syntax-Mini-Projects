package com.adebusoye.javaCheckbox60;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // JCheckBox = A GUI component that can be selected or deselected

        new MyFrame();

    }
}
//***********************************

class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src\\main\\java\\com\\adebusoye\\javaCheckbox60\\img.png");
        checkIcon = new ImageIcon("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src\\main\\java\\com\\adebusoye\\javaCheckbox60\\img.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
