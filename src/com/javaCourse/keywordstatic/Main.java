package com.javaCourse.keywordstatic;

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Sponge bob");
        Friend friend2 = new Friend("batman");
        Friend friend3 = new Friend("el");
        System.out.println(Friend.numberOfFriends);
    }
}
