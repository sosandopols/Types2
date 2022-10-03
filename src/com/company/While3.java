package com.company;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do{
            name = scanner.nextLine();
            System.out.println("hi, "+name);
        }while (name.isBlank());
    }
}
