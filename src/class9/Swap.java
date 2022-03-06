package class9;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=in.nextInt();
        System.out.println("Enter the second number");
        int b=in.nextInt();
        int c;
        System.out.println("a old value "+a);
        System.out.println("b old value "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("new value of a "+a);
        System.out.println("new value of b "+b);
    }
}
