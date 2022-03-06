package book;

import java.util.Scanner;

/*
20. Write a program to input a word and print its letters one below the other.
Input : BLUEJ
 */
public class Bluej{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String n=scanner.nextLine();
        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.charAt(i));
        }
    }
}
