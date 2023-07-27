package org.java_tutorials.classX;

public class SingleLoopPattern1 {
    public static void main(String[] args) {
        int n = 123456789;
        for (int i = 1; i <= 5; i++) {
            System.out.println(n);
            n = n / 100;
        }
    }
}
