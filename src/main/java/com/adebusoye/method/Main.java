package com.adebusoye.method;

// method = a block of code that is executed whenever it is called upon

public class Main {
    public static void main(String[] args) {
        String name = "Akinade";
        int age = 21;
        int x = 3;
        int y = 4;


        hello(name,age);
        System.out.println(add(x,y));


    }
    static void hello(String th, int hh){
        System.out.println(th+hh);
    }
    static int add(int f, int u){
        int p = f+u;
        return p;
    }
}
