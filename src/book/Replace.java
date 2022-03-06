package book;/*
19. Write a program to input a word and convert it to uppercase. book.Replace all the book.vowels with ‘*’
Eg: Input: we will overcome output: W* W*LL *V*RC*M*
 */

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n=scanner.nextLine();
        n=n.toUpperCase();
        n=n.replace("A","*").
                replace("E","*").
                replace("I","*").
                replace("O","*").
                replace("U","*");
        System.out.println(n);
    }
}
