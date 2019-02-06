package com.johncarlin;

public class Main {

    public static void main(String[] args) {
        printEqual(1 , 1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

    }

    public static boolean isCatPlaying( boolean summer, int temperature) {
        if (temperature < 25) {
            return false;
        } else if (temperature <= 35) {
            return true;
        } else if (summer && temperature <= 45) {
            return true;
        } else {
            return false;
        }
    }
}
