package com.adebusoye.whileLoop;
import java.util.Scanner;

// while loop = executes a block of code(unlimitedly) as long as its condition remains true
//              escape and move on to the next printOut statement as long as its condition remains false

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine(); // overrides the next loop

        }
        System.out.println("Hello " + name);
    }
}
