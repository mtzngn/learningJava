package com.javaCourse.filewriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try{
//            FileWriter writer = new FileWriter("poem.txt");
//            writer.write("Roses are red \n violets are blue");
//            writer.append("\n test");
//            writer.close();
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();

            while(data != -1){
                System.out.println((char)data);
                data = reader.read();

            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
