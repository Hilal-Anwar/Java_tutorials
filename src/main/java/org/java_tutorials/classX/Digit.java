package org.java_tutorials.classX;

public class Digit {
    public static void main(String[] args) {
        int x = 46578, t;
        for (int i = 9; i >= 0; i-=1) {
            t = x;
            while (t > 0) {
                int r = t % 10;
                if (r == i)
                    System.out.print(i);
                t /= 10;
            }
        }

    }
}
