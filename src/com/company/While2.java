package com.company;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while (a!=0){
            System.out.println("enter a: ");
            a = scanner.nextInt();
            System.out.println(a);
        }
    }
}
