package tutorials_1;

import java.util.Scanner;

/*
15.Write a program to input a word and check whether it is a tutorials_1.palindrome or not.
Example: MADAM – tutorials_1.palindrome class – not tutorials_1.palindrome
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=scanner.nextLine();
        StringBuilder builder=new StringBuilder(s);
        if(builder.reverse().toString().equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
