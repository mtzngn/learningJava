package com.javaCourse.foreach;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("rat");

        for(String animal: animals) {
            System.out.println(animal);
        }
    }
}
