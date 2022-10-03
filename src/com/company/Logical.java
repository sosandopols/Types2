package com.company;

public class Logical {
    public static void main(String[] args) {
        int a = 3, b = 2, c = 3;
        boolean b1 = (a == b) && (a != c);
        System.out.println(b1);
        boolean b2 = (b > a) || (c > a);
        System.out.println(b2);
        boolean b3 = (a >= b) && (b<=c);
        System.out.println(b3);
        boolean b4 = (a!=b) || (b!=c);
        System.out.println(b4);

        int x1 = 1, y1 = 1, x2 = 1, y2 = 3;
        boolean bishop = Math.abs(x2-x1) == Math.abs(y2-y1);
        System.out.println(bishop);

        boolean lad = (x2 == x1) || (y1 == y2);
        System.out.println(lad);


    }
}
