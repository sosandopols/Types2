package com.company;

public class CountDigits {
    public static void main(String[] args) {
        int n = 123456789;

        String s = Integer.toString(n);
        System.out.println(s.length());

        int count = (int) Math.floor(Math.log10(n) + 1);
        System.out.println(count);
    }
}
