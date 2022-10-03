package com.company;

public class Enums {
    public static void main(String[] args) {
        Arrows l = Arrows.LEFT;
        System.out.println(l);
        System.out.println(l.ordinal());

        Colors colorBus = Colors.BLACK;
        System.out.printf("Color of the bus %s", colorBus);

        int day = 4;
        System.out.printf("today is %s", Days.values()[day-1]);
    }
}

enum Arrows{LEFT, RIGHT, UP, DOWN}
enum Colors{BLACK, WHITE, GRAY, RED, GREEN, BLUE}
enum Days{MONDAY, TUESDAY, WEDNESDAY, THURSDAY}