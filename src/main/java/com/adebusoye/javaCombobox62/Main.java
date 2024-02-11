package com.adebusoye.javaCombobox62;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
            // JComboBox = A component that combines a button or editable field and a drop-down list

            new MyFrame();

        }
    }

//***********************************************
    class MyFrame extends JFrame implements ActionListener {
        JComboBox comboBox;

        MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());

            String[] animals = {"dog","cat","bird"};

            comboBox = new JComboBox(animals);
            comboBox.addActionListener(this);

//            comboBox.setEditable(true);
//            System.out.println(comboBox.getItemCount());
//            comboBox.addItem("horse");
//            comboBox.insertItemAt("pig", 0);
//            comboBox.setSelectedIndex(0);
//            comboBox.removeItem("cat");
//            comboBox.removeItemAt(0);
//            comboBox.removeAllItems();

            this.add(comboBox);
            this.pack();
            this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==comboBox) {
                System.out.println(comboBox.getSelectedItem());
                //System.out.println(comboBox.getSelectedIndex());
            }
        }
    }

