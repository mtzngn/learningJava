package com.javaCourse.polymorphism;

public class Main {
    public static void main(String[] args) {

        //ability of an object to identify as more than one type is called polymorphism

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for(Vehicle x : racers) {
            x.go();
        }
    }
}
