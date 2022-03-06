package book;

import java.util.Scanner;

/*
18. Write a program to accept a name and display its initials along with the book.surname
Eg. Input: Mahendra Singh Dhoni Output: M.S. Dhoni
 */
public class surname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n=scanner.nextLine();
        n=n.trim();
        String f=""+n.charAt(0);
        String s=""+n.charAt(n.indexOf(' ')+1);
        String l=n.substring(n.lastIndexOf(' ')+1);
        System.out.println(f+"."+s+"."+l);
    }
}
