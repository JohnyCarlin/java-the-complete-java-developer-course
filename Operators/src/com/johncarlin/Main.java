package com.johncarlin;

public class Main {

    public static void main(String[] args) {

        double my20 = 20;
        double my80 = 80;
        double myRem = ((my20 + my80) * 25) % 40;
        if (myRem <= 20)
            System.out.println("Total was over the limit");
    }
}
