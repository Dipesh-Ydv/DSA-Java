package com.dipesh.iostreams;

import java.io.ByteArrayInputStream;

/**
 * ByteArrayInputStream is used to read a byte array as input stream.
 * It contains an internal buffer to read a byte array as stream.
 * ByteArrayOutputStream is
 */
public class BAS {
    public static void main(String[] args) throws Exception{
        byte[] buf = {35, 36, 37, 38};
        ByteArrayInputStream bai = new ByteArrayInputStream(buf);

        int k;
        while ((k = bai.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value of Character is: " + k + "; Special character is: " + ch);
        }
        bai.close();
    }

}
