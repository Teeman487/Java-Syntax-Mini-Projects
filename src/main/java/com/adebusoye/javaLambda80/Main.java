package com.adebusoye.javaLambda80;

import javax.swing.*;

/*@FunctionalInterface
interface MyInterface {

    public void message(String name,char symbol);
}*/
//******************************* Example 1 **************************************
/*public class Main  {

    public static void main(String[] args) {

        *//* lambda expression = 	feature for Java 8 and above
         * 						also known as an anonymous method
         * 						a shorter way to write anonymous classes with only one method
         *
         *						need to use a functional interface or use a pre-defined functional interface
         *						they contain only one abstract method
         *						ex. ActionListener, Runnable, (user-defined)
         *
         *						A Lambda expression can be used in any place where a functional interface is required
         *						How to use a lambda expression:
         *						(arguments) -> {statement/s}
         *//*


        String name = "Bro";
        char symbol = '!';

        MyInterface myInterface = (x,y) -> {
            System.out.println("Hello World!");
            System.out.println("It is a nice day "+x+y);
        };

        MyInterface myInterface2 = (x,y) -> {
            System.out.println("Hello "+x+y);
        };

        myInterface.message(name,symbol);
        myInterface2.message(name,symbol);

    }

}*/
//******************************* Example 2 **************************************
public class Main {

    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();
    }

}
//************************************************************************************



class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON 1");
    JButton myButton2 = new JButton("MY BUTTON 2");

    MyFrame(){

        myButton.setBounds(100, 100, 200, 100);
        myButton.addActionListener(

                (e) -> System.out.println("This is the first button")

        );

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(

                (e) -> System.out.println("This is the second button")

        );

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
