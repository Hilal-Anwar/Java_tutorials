package org.java_tutorials.classIX;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a;
        a = in.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(i * a);
            i = i + 1;
        }
    }
}
