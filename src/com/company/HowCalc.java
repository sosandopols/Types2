package com.company;

public class HowCalc {

    public static void main(String[] args) {
        double a=5/3.;
        System.out.println(String.format("%6.2f", a));

        double c=2/0.;
        System.out.println(c);

        System.out.println(Double.isInfinite(c));

        double g=1./2/Math.sin(Math.PI/6);
        System.out.println(g);
    }
}
