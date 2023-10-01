package org.java_tutorials.classIX;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        /*
        a=5
        b=9
        6
        7
        8
         */
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        a=a+1;
        while (a<b){
            System.out.println(a);
            a=a+1;
        }
    }
}
