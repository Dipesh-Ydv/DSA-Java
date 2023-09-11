package com.dipesh.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {
    public static void main(String[] args) {
        try {

            FileOutputStream fos = new FileOutputStream("/Users/dipeshyadav/Desktop/Test.txt");
            String name = "Dipesh Yadav : ";
            // converting the string into a byte array
            fos.write(name.getBytes());

            String str = "Learning Java Programming";
            // creating a byte array
            byte[] nameArr = str.getBytes();
            // reading byte by byte
            for (byte x : nameArr) {
                fos.write(x);
            }
            // closing the file
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
