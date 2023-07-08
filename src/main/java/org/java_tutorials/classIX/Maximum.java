package org.java_tutorials.classIX;


import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Enter three number");
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int max,min=0;
        /*
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        System.out.println("The maximum number is = "+max);
        */
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else
            max = c;
        System.out.println(max);
        System.out.println(min);

    }
}
