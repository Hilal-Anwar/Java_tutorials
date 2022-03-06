package huzifa;

import java.util.Scanner;

public class Distance
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the distance in meter");
        int m=in.nextInt();
        System.out.println(m/1000+" Km "+" and "+(m%1000)+"meter");
    }
}
