package org.java_tutorials.classIX;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Kripya do number dale");
        a = in.nextInt();
        b = in.nextInt();
        int max = a > b ? a : b;
        System.out.println(a > b ? a : b);
    }
}
