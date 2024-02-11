package com.adebusoye.file;

import java.io.File;
// file = An abstract representation of file and directory path names
public class Fl {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MR AKINADE AA\\Desktop\\file1.txt");
        if(file.exists()){
            System.out.println("That file exist! :o!");
           System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath()); // LOCATION
           System.out.println(file.isFile());
//            file.delete();
        }
        else {
            System.out.println("That file doesnt exist");
        }
    }
}
