package com.dipesh.iostreams;

/**
 * Program for reading from one file and writing data into another file.
 * Text must be written into lowercase.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputPractice {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/dipeshyadav/Desktop/Source1.txt");
            // If file doesn't exist, it will create the file.
            FileOutputStream fos = new FileOutputStream("/Users/dipeshyadav/Desktop/Source2.txt");

            int a;
            while ((a = fis.read()) != -1) {
                // checking whether the input character is in uppercase or lowercase
                if (a >= 65 && a <= 90) {
                    // converting uppercase into lowercase
                    fos.write(a+32);
                } else {
                    fos.write(a);
                }
            }
            fis.close();
            fos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
