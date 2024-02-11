package com.adebusoye.Static;
// static  = modifier. A single copy of a variable/method is created and shared.
//            The class "owns" the static member
public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Toheeb");
        Friend friend2 = new Friend("Akinade");
        Friend friend3 = new Friend("Morenikeji");
        System.out.println(Friend.numberOfFriends); // constructor calls
        System.out.println(Friend.goal());


    }



}


class Friend {
    static String name;
    static int numberOfFriends;
    int good;


    //Constructor
    Friend(String name) {
        this.name = name;
       numberOfFriends++; // it will increase for the no of instantiated time of construction

    }

    static String goal() {

        return "He scores the goal";
    }
}
