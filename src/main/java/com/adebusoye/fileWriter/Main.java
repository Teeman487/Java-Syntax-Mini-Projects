package com.adebusoye.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter writer;

        {
            try {
                writer = new FileWriter("C:\\Users\\MR AKINADE AA\\IdeaProjects\\Java_Syntax_MiniProject\\src" +
                        "\\main\\java\\com\\adebusoye\\fileWriter\\Quran.txt");
                  writer .write("Read your Quran daily, brother");
                  writer.append("\n(And follow the way of the rightly guided)");
                  writer.append("\tAnd observe the obligatory prayers");
                  System.out.println("Done as said");

                writer.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
