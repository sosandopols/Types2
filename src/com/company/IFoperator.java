package com.company;

import java.util.Scanner;

public class IFoperator {
    public static void main(String[] args) {
        /*
         If the light bulb turns on, it will be glow.
         If the temperature is below zero degrees Celsius, the water will be freeze.
         If the user will input a natural number, the program will return a doubled answer and will exit with a status code 0.
         And if the user will input zero, the program will exit with a status code 1.
         Check the number parity, which is a program command line argument.
         The user input two integer numbers as command line arguments. The program output a sum of these numbers.
         If the traffic light is red, you have to stop. If the traffic light is green, you can proceed a movement.
         Else you should wait.
         We have no one, one or two names as arguments of command line. The program will output one of the phrases:
         No one likes this.
         Peter likes this.
         John and Peter like this.
         */
        boolean light = true;
        if (light)
            System.out.println("ON");
        else
            System.out.println("OFF");
        double temp = 0;
        if (temp <= 0)
            System.out.println("the water will be freeze");
        else
            System.out.println("NO");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(x * 2);
        } else
            System.exit(-1);
        System.out.println("dfkgs");
        if (x == 0)
            System.out.println();
        x = Integer.parseInt(args[0]);
        if (x % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
        String s = "red";
        if(s == "red")
            System.out.println("stop");
        else if(s == "yellow")
            System.out.println("wait");
        else if(s == "green")
        System.out.println("walk");

        if (args.length == 0)
            System.out.println("no onr likes this");
        else if (args.length == 1)
            System.out.printf("%s like this", args[0]);
        else if (args.length == 2)
            System.out.printf("%s and %s like this", args[0] , args[1]);

    }
}
