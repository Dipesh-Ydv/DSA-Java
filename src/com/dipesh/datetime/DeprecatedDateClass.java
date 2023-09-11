package com.dipesh.datetime;

import java.util.Date;

public class DeprecatedDateClass {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(Long.MAX_VALUE);

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        // counting for month and day starts from zero(0)
        System.out.println(d.getMonth());
        System.out.println(d.getDay());
    }
}
