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


//        Human human = new Human("taha", 28, 60);
//        System.out.println(human.name);
//        System.out.println(human.age);
//        System.out.println(human.weight);
//        human.eat();

        Pizza pizza = new Pizza("thin crust", "tomato", "mozerella");

        System.out.println("Here are the ingredients for your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

    }
}
