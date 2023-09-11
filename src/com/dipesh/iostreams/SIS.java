package com.dipesh.iostreams;

import java.io.*;

/**
 * SequenceInputStream is used to read data from 2 FileInputStream in a sequence.
 * It will concatenate the data of each file one after another.
 */

public class SIS {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("/Users/dipeshyadav/Desktop/Source1.txt");
            FileInputStream fis2 = new FileInputStream("/Users/dipeshyadav/Desktop/Source2.txt");

            FileOutputStream fos = new FileOutputStream("/Users/dipeshyadav/Desktop/Destination.txt");

            // the first file will be read completely after that second file will be start reading.
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int data;
            while ((data = sis.read()) != -1) {
                fos.write(data);
            }

            // closing all the streams.
            fis1.close();
            fis2.close();
            fos.close();
            sis.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
