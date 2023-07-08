package org.java_tutorials.util;



import java.util.*;

public class Hello {
    public static void main(String[] args) {
        int a,b,s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        a=in.nextInt();
        System.out.println("Enter a number");
        b=in.nextInt();
        s=a+b;
        System.out.println("Sum is = "+s);
    }
}
