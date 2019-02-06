package com.johncarlin;

public class Main {

    public static void main(String[] args) {
        String namePlayer = "John";
        int positionPlayer = 2;
        int scorePlayer = 1500;

        displayHighScorePosition(namePlayer, positionPlayer);
        calculateHighScorePosition(scorePlayer);

    }

    public static void displayHighScorePosition(String namePlayer , int positionPlayer) {

        System.out.println(namePlayer +
                " managed to get into position " +
                positionPlayer +
                " on the high score table");

    }

    public static int calculateHighScorePosition(int scorePlayer) {

        int result = 4;
        if (scorePlayer > 1000) {
            result = 1;
        } else if ((scorePlayer > 500) && (scorePlayer < 1000)) {
            result = 2;
        } else if ((scorePlayer > 100) && (scorePlayer < 500)) {
            result = 3;
        }
        return result;
    }

}