package com.javaCourse.fileclass;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("secret_message.txt");

        if(file.exists()) {
            System.out.println("that file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        } else {
            System.out.println("that file doesn't exist");
        }
    }
}
