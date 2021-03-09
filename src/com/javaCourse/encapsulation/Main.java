package com.javaCourse.encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "4.25", 2020);
        car.setYear(2021);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
