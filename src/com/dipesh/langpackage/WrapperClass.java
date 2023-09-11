package com.dipesh.langpackage;

/*
    * Wrapper classes are those classes that are made around primitives.
    * These classes provide a mechanism for converting primitive into the object and vice-versa.
*/

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = Integer.valueOf(22);
        Integer c = Integer.valueOf("83");

        // This is boxing
        int f = 12;
        Integer g = Integer.valueOf(f);
        // this is auto-boxing
        Integer k = f;

        // This is unboxing
        int e = b.intValue();
        // this is auto-unboxing
        int d = a;

        Float h = a.floatValue();
        System.out.println(h);
    }
}
