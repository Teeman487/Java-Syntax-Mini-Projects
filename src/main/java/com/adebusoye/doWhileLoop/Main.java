package com.adebusoye.doWhileLoop;
import java.util.Scanner;

// doWhileLoop = variation of while loop, you move the while() to the end of  block of code & precede with do{
// We always perform our block of code at least once, and then we check the condition after
// Which means, we perform our block of code once even if the condition remains false
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine(); // overtakes the next loops

        } while (name.isBlank());
        System.out.println("Hello " + name);
    }
}
