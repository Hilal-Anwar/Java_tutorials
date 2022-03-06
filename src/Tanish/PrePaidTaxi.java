package Tanish;

import java.util.Scanner;
//Q 9 PG 150
public class PrePaidTaxi
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the taxi number");
        String taxiNo=scanner.nextLine();
        System.out.println("Enter the distance in km");
        int distance=scanner.nextInt();
        double rate=0.0;
        if (distance<=5)
            rate=100;
        if (distance>5&&distance<=15)
            rate=100+(distance-5)*10;
        if (distance>15&&distance<=25)
            rate=100+10*10+(distance-15);
        if (distance>25)
            rate=100+10*10+10*8+(distance-25)*5;
        System.out.println("Taxi No = "+taxiNo);
        System.out.println("Distance traveled = "+distance);
        System.out.println("Amount to be paid = "+rate);
    }
}
