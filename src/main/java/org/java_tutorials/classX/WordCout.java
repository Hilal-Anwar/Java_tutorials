package org.java_tutorials.classX;

import java.util.Scanner;

public class WordCout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sr, s1 = "";
        sr = in.nextLine();
        System.out.println(sr);
        int l = sr.length();
        int count = 0;
        int k = 0;
        for (int i = 0; i < l; i++) {
            char c = sr.charAt(i);
            if (c == ' ' && k == 0)
            {
                count++;
                k = 1;
            } else if (c != ' ')
                k = 0;

        }
        count = count + 1;
        System.out.println("Total number of words =" + count);
    }
}
