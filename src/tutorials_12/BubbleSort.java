package tutorials_12;

import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args) {
        System.out.println("Enter a array");
        Scanner in=new Scanner(System.in);
        int []a=new int [10];
        int temp;
        for (int i=0;i<10;i++){
            a[i]=in.nextInt();
        }
        for (int i=0;i<10;i++){
            for (int j=0;j<9;j++){
                if (a[j+1]<a[j])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is");
        for (int b=0;b<10;b++)
            System.out.println(a[b]);
    }
}
