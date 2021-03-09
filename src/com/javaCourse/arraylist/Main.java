package com.javaCourse.arraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //array lists are resizable arrays. only stores reference data types.
//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("chicken");
//        food.add("hamburger");
//        System.out.println(food.get(0));
//        food.set(0, "sushi");
//
//        food.remove(2);
//        food.clear();
//        for(int i=0; i< food.size(); i++){
//            System.out.println(food.get(i));
//        }

        //2d array lists are dynamic list of lists

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("sourdough bread");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatos");
        produceList.add("mushrooms");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("whiskey");
        drinksList.add("vodka");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(1));

    }
}
