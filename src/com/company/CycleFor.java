package com.company;

import java.util.Random;

public class CycleFor {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 5; i++)
            System.out.println(i);

        Random random = new Random();
        for (i = 0; i < 10; i++)
        {
            int n = random.nextInt(10);
            System.out.print(n+" ");
        }
    }
}
