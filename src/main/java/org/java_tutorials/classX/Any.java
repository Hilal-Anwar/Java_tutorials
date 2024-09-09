package org.java_tutorials.classX;

import java.util.Scanner;

public class Any {
    public static void main(String[] args) {
        int a  = 12, b = 13, c;
        c = a++ + ++a / 7 + b++;
        System.out.println(a + "\t" + b + "\t" + c);
        c = ++a + a++ / 3 + ++b;
        System.out.println(a + "\t" + b + "\t" + c);

    }
}
