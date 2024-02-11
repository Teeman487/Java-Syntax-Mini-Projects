package com.adebusoye.variable;

import java.util.InputMismatchException;
import java.util.Scanner;

// Variable is a placeholder for a value and behaves as the value it contains
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();

        int age = 0;
        try {
            System.out.print("How old are you?(type the correct age): ");
            age = scanner.nextInt();
        } catch (InputMismatchException e) {
        }

        scanner.nextLine();
        System.out.print("How tall are you? ");
        String height = scanner.nextLine();

        System.out.println("\t Hello " + name); //                    \t-escape sequence-push to middle

        System.out.println("\"You are\" " + age + " years old"); //  "You are" 55 years old
        System.out.println("\n Hello \n" + name); // \n it pushes or escape to the next line of console
        System.out.println("\\You are " + height + " cm tall"); //   \You are 44 cm tall
        scanner.close();

    }
}
