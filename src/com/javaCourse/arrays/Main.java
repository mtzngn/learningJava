package com.javaCourse.arrays;

public class Main {
    public static void main(String[] args) {
//        String[] cars = {"porsche", "bmw", "mercedes"};
//        System.out.println(cars[1]);

//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "porche";
//        cars[0][1] = "bmw";
//        cars[0][2] = "mercedes";
//
//        cars[1][0] = "tesla";
//        cars[1][1] = "ford";
//        cars[1][2] = "chavrole";
//
//        cars[2][0] = "ferrari";
//        cars[2][1] = "fiat";
//        cars[2][2] = "lance";

        String[][] cars = {
                {"porche", "bmw", "mercedes"},
                {"tesla", "ford", "chavrole"},
                {"ferrari", "fiat", "lance"}
        };

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j <cars[i].length; j++){
                System.out.print(cars[i][j] +" ");
            }
        }
    }
}
