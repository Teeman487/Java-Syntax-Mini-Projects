package com.adebusoye.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// FileReader = reads the contents of a file as a stream of characters. One by one
//                  read() returns an int value which contains the byte value
//                when read() returns -1, there is no more data to be read

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader;

                reader = new FileReader("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src\\main\\java\\com\\adebusoye\\fileReader\\poem.txt");
                int data = reader.read();
                while (data ==-1) {
                    System.out.print((char)data);
                    data = reader.read();

                }
                reader.close();
    }
}
