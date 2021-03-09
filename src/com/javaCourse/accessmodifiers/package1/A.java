package com.javaCourse.accessmodifiers.package1;
import com.javaCourse.accessmodifiers.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
