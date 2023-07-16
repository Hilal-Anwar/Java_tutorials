package org.java_tutorials.classIX;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side1, side2, side3;int c=0;
        System.out.println("Please Enter Three sides of Triangle ");
        side1 = in.nextDouble();
        side2 = in.nextDouble();
        side3 = in.nextDouble();
        if(side1 + side2  >  side3)
        {
            if (side2 + side3 > side1)
            {
                if (side1 + side3 > side2)
                {
                    c = 5;
                }
            }
        }
        if(c == 5)
        {
            System.out.println("It is a Valid Triangle");
        }
        else
        {
            System.out.println("It is Not a Valid Triangle");
        }
    }
}
