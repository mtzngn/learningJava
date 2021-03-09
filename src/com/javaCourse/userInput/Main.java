package com.javaCourse.userInput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name");
        String name = scanner.nextLine();
        System.out.println("Whats your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("hello " + name);
        System.out.println("your age is " + age);
    }
}
