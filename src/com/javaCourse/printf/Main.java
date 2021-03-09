package com.javaCourse.printf;

public class Main {
    public static void main(String[] args) {

//        System.out.printf("This is format string %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Taha";
        int myInt = 22;
        double myDouble = -1000;

//        System.out.printf("%b \n", myBoolean);
//        System.out.printf("%c \n", myChar);
//        System.out.printf("%s \n", myString);
//        System.out.printf("%d \n", myInt);
//        System.out.printf("%f \n", myDouble);

        //[width]
//        System.out.printf("Hello %10s", myString);
        //[precision]
//        System.out.printf("you have this much money %.2f", myDouble);
        //[flags]
        System.out.printf("you have this much money %20f \n", myDouble);
        System.out.printf("you have this much money %+f \n", myDouble);
        System.out.printf("you have this much money %020f \n", myDouble);
        System.out.printf("you have this much money %,f \n", myDouble);


    }
}
