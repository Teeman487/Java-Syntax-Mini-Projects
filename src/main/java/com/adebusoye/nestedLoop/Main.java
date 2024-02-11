package com.adebusoye.nestedLoop;
import java.util.Scanner;

// nested loops = a loop inside a loop
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.print("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();

            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol+" "); // $$
            }
        }
    }

}
