package class9;

import java.util.Scanner;

public class Pronic_Number
{
    public static void main(String[] args) {
        var in=new Scanner(System.in);
        System.out.println("Enter a number");
        double k=in.nextDouble();
        long t=System.currentTimeMillis();
        System.out.println(isPronic(k));
        System.out.println(System.currentTimeMillis()-t);
        t=System.currentTimeMillis();
        System.out.println(isPronic_(k));
        System.out.println(System.currentTimeMillis()-t);
    }
    private static boolean isPronic(double number){
        double a=Math.sqrt(4* number +1);
        double p=(a+1)/2;
        //double q=(-a-1)/2;
        return (p-(int)(p)==0 && (p*(p-1)== number));
    }
    private static boolean isPronic_(double k){
        for (double i = 1; i <= Math.sqrt(k); i++) {
            if(i*(i+1)==k)
                return true;
        }
        return false;
    }
}
