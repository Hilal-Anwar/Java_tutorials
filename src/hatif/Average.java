package hatif;

import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        int a,b,c;
        double sum,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        sum=a+b+c;
        avg=sum/3;
        System.out.println("The of 3 numbers are = "+sum);
        System.out.println("The  average of 3  numbers are = "+avg);

    }
}
