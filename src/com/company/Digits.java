package com.company;

public class Digits {
    public static void main(String[] args) {
        int a = 123;
        int hundreds = a/100;
        int tens = a / 10 % 10;
        int ones = a%10;

        int b = ones * 100 + tens * 10 + hundreds;
        System.out.println(b);

        String s = Integer.toString(a);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        b = Integer.parseInt(sb.toString());
        System.out.println(b);
    }
}
