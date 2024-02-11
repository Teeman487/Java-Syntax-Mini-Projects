package com.adebusoye.random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //int x = random.nextInt(6); // Generate rd btwn 0 & 5
        int x = random.nextInt(6) + 1;  // Generate rd btwn 1 & 6
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
