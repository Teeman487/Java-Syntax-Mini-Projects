package com.adebusoye.forEach;

import java.util.ArrayList;

// for-each = traversing technique to iterate through the elements in an array/collection
//            less steps, more readable
//            less flexible
public class Main {
    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "rat", "bird"};

        ArrayList<String> animal = new ArrayList<String>();
        animal.add("lion");
        animal.add("zebra");
        for(String i : animal) {
            System.out.println(i);
        }
    }
}
