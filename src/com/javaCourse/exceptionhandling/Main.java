package com.javaCourse.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by 0, its infinite!");
        } catch (InputMismatchException e) {
            System.out.println("please enter a number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
//            System.out.println("will always print");

    }
}
