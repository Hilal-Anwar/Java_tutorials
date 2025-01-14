package org.java_tutorials.part_1.classIX;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //array
        Scanner in = new Scanner(System.in);
        /*int a[] = new int[10];
        System.out.println("Enter 10 element in the array");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }

         */

        int b[][]=new int[3][5];
        b[0][3]=7;
        System.out.println(Arrays.deepToString(b));
    }
}
