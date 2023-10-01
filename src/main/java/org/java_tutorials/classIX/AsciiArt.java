package org.java_tutorials.classIX;

import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        while (true) {
            ch = in.nextLine().charAt(0);
            System.out.println(ch + "  " + (char) ch);
        }
    }
}
