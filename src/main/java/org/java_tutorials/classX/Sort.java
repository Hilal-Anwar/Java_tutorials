package org.java_tutorials.classX;

import java.util.Scanner;

public class Sort
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []a=new int[10];
        System.out.println("Enter the numbers in the array");
        for (int i=0;i<10;i++){
            a[i]=in.nextInt();
        }
        //sort the array
        int temp=0;
        for (int i=0;i<10;i++){
            for (int j=i;j<10;j++){
                if (a[j]>a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int b=0;b<10;b++)
            System.out.println(a[b]);
    }
}
