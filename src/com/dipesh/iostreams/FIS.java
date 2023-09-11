package com.dipesh.iostreams;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream is a class that is used to take input from a file.
 * Object of FileInputStream only read once.
 * It reads data as bytes.
 */

public class FIS {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/dipeshyadav/Desktop/Test.txt");
            // available() method gives the length of the file
            byte[] b = new byte[fis.available()];

            // the result will be stored into the byte array
//            fis.read(b);

            // converting a byte array into string
            String str = new String(b);

            System.out.println(str);

            // Reading data from the file byte by byte
            int x;

            // The File ends when it returns -1.
            // It will read the ASCII code of each character.
            while ((x = fis.read()) != -1) {
                // Converting ASCII code into corresponding character
                System.out.print((char) x);
            }

            // closing the stream
            fis.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
