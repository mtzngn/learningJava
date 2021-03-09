package com.javaCourse.oop;

public class Main {
    public static void main(String[] args) {

//        Car myCar = new Car();
//        Car mySecondCar = new Car();

//        System.out.println(myCar.model);
//        System.out.println(myCar.make);
//        System.out.println(myCar.price);
//        System.out.println(myCar.color);
//        myCar.drive();
//        myCar.brake();


        Human human = new Human("taha", 28, 60);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);
        human.eat();
    }
}
