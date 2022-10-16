package tutorials_1;

import java.util.Scanner;

public class Kg
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the wight in gram");
        int g = in.nextInt();
        int kg=g/1000;
        g=g%1000;
        System.out.println(kg+" tutorials_1.Kg and "+g+" gram");
    }
}
