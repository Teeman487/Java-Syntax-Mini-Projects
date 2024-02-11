package com.adebusoye.printF;
// printf() = an optional method to control, format, and display text to the console window
//            two arguments = format string + (object/variable/value)
//            % [flags] [precision] [width] [conversion-character]

public class Main {
    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Toheeb";
        int myInt = 50;
        double myDouble = 1000;


        // [conversion-character]
//        System.out.printf("%d This is a format string",123); // 123 This is a format string
//        System.out.printf("%b correct",myBoolean); // true correct
//        System.out.printf("%c",myChar); // @
//       System.out.printf("%s string..",myString); // Toheeb string..
//        System.out.printf("%d integer...",myInt);  // 50 integer...
//          System.out.printf("%f double...",myDouble);  // 1000.000000 double...

        // [width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %10s",myString);

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf(" You have this much money %,+20f",myDouble);

        // [flags]
        //  adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

    //   System.out.printf("You have this much money %20f",myDouble);   // You have this much money          1000.000000
//        System.out.printf("You have this much money %+f",myDouble); // You have this much money +1000.000000
//       System.out.printf("You have this much money %020f",myDouble); // You have this much money 0000000001000.000000
//     System.out.printf("You have this much money %,f",myDouble); // You have this much money 1,000.000000


    }
}
