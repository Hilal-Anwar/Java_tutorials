package Algorithem;

import java.util.*;
import java.io.*;
class table{
    public static void main(String[] args)throws IOException, InterruptedException
    {
        System.out.println("Enter a nuber");
        while (true){
            int n= (int) (Math.random() * 9) +1;
        for(int i=1;i<10;i++)
            System.out.println(n+" X  "+i+" = "+(n*i));
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
    }
}