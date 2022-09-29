package com.company;

public class Bin {
    public static void main(String[] args) {
        int a = 12;
        String s = Integer.toBinaryString(a);
        System.out.println(s);

        s = "1100";
        int b = Integer.parseInt(s, 2);
        System.out.println(b);

        a = 15;
        s = Integer.toHexString(a);
        System.out.println(s.toUpperCase());

        s = "AF";
        b = Integer.parseInt(s, 16);
        System.out.println(b);

        s = "1010";
        b = Integer.parseInt(s, 2);
        s = Integer.toHexString(b);
        System.out.println(s.toUpperCase());
    }
}
