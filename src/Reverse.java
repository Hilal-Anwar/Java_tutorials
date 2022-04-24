import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=in.nextLine();
        StringBuilder s1=new StringBuilder(s);
        if (s1.reverse().toString().equals(s))
            System.out.println("Palindrome string");
        else System.out.println("Not palindrome string");
    }
}
