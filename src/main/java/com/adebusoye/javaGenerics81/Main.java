package com.adebusoye.javaGenerics81;

//----------------------- Generic Method -----------------------
// generics = enable types(classes and interfaces) to be parameters when defining:
//            classes, interfaces and methods
//            a benefit is to eliminate the need to create multiple versions of
//            methods or classes for various data types.
//            Use1 version for all reference data types


/*public class Main {



    public static void main(String args[]) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B","Y","E"};

        System.out.print("Integer Array: ");
        displayArray(intArray);
        System.out.println(firstIndex(intArray));

        System.out.print("Double Array: ");
        displayArray(doubleArray);
        System.out.println(firstIndex(doubleArray));

        System.out.print("Character Array: ");
        displayArray(charArray);
        System.out.println(firstIndex(charArray));

        System.out.print("String Array: ");
        displayArray(stringArray);
        System.out.println(firstIndex(stringArray));
    }

    // Generic method
    public static <Thing> void displayArray(Thing[] array) {

        for(Thing x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    // Generic method with generic return type
    public static <Thing> Thing firstIndex(Thing[] array) {

        return array[0];
    }
}*/
//----------------------- Generic Class -----------------------

public class Main {

    public static void main(String args[]) {

        //bounded types = 	you can create the objects of a generic class to have data
        //					of specific derived types ex.Number

        MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
        MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);
//        MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
//        MyGenericClass<String,Character> myString = new MyGenericClass<>("Hello",'!');


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());
    }
}
// ----------------------------------------------------------------
class MyGenericClass <Thing extends Number, Thing2 extends Number>{

    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue() {
        return y;

    }
}
