package com.adebusoye.local_Global_toString__;
//local = declared inside a method, visible only to that method

// global = declared outside a method, but within a class visible to all parts of class

// overloaded constructor = multiple constructors within a class with the same name,
//                           but have different parameters
//                            name + parameters = signature

// toString() = special method that all objects inherit;
//              that returns a string that "textually represents" an object.
//                can be used both implicitly and explicitly.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
       // System.out.println(car.cool()); // Explicitly
        System.out.println(car);  // Implicitly
        System.out.println();
      // System.out.println(car.toString());
    }

}
class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    public String cool() {
        return color;

    }

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

}