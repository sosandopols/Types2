package com.company;

public class While {
    public static void main(String[] args) {
        int i = 1, i1 = 0, j = 1;
        while (i1 < 50)
        {
            i1+=j;
            System.out.println(i1);
            j++;
        }
        System.out.println(j - 1);
    }
}
