package com.javaCourse.methodoverriding;

public class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("woof woof");
    }
}
