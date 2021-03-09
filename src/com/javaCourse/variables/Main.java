package com.javaCourse.variables;
/*
 datatype --- size --- prim/ref --- value
 --------------------------------------------
 boolean  -- 1bit   -- primitive -- true or false
 byte     -- 1byte  -- primitive -- -128 to 127
 short    -- 2bytes -- primitive -- -32.768 to 32.767
 int      -- 4bytes -- primitive -- - 2billion to 2billion
 long     -- 8bytes -- primitive -- -9 to 9 quintillion
 float    -- 4bytes -- primitive -- fractional number. 6-7 digits
 double   -- 8bytes -- primitive -- fractional number 15 digits.
 char     -- 2bytes -- primitive -- single character/letter/ASCII value
 String   -- varies -- reference -- a sequence of characters
* */
public class Main {
    public static void main(String [] args){
//        int x = 12;
//        long y = 1231231232123123123L;
//        float z = 3.14f;
//        double n = 3.1431221321312312312321;
//        char symbol = 'S';
//        String message = "learning java";
//
//        System.out.println("number is " + x);
//        System.out.println("long is " + y);
//        System.out.println(z);
//        System.out.println(symbol);
//        System.out.println(message);

        String x = "water";
        String y = "cola";
        String temp;

        temp = x;
        x = y;
        y = temp;
        System.out.println("x is" + x);
        System.out.println("y is" + y);
    }
}
