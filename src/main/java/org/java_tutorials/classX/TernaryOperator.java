package org.java_tutorials.classX;

import java.util.Scanner;

class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        if (n % 2 == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");
    }
}
