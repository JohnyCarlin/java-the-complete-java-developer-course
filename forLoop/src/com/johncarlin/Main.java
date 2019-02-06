package com.johncarlin;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int count = 0;

        while (number < 100 && count < 5) {
            number++;
            if (isEvenNumber(number)) {
                count++;
                System.out.println(number);
                continue;

            }

        }
        System.out.println(count);
    }

    public static boolean isEvenNumber( int number ) {

        if (number <= 0 ) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }



}
