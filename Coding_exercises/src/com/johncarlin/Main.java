package com.johncarlin;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(256, 17));
        System.out.println(getDurationString(25460));

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59)
            return "Invalid value";

        int hours = minutes / 60;
        minutes = minutes % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0)
            return "Invalid value";

        return getDurationString(seconds / 60, seconds % 60);
    }

}
