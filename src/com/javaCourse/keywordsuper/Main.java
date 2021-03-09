package com.javaCourse.keywordsuper;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("batman", 42, "money");
        Hero hero2 = new Hero("superman", 99, "everything");

//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);
        System.out.println(hero2.toString());

    }
}
