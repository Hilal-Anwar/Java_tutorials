package org.java_tutorials.classIX;


import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Enter three number");
        Scanner in=new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int max,min;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        System.out.println("The maximum number is = "+max);

    }
}
