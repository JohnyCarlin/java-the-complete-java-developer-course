package com.johncarlin;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Challenge rover2 = new Challenge("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}
