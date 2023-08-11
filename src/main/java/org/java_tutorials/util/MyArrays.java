package org.java_tutorials.util;

public class MyArrays {
    public static int[] random_array(int n) {
        var x = new int[n];
        int k;
        for (int i = 0; i < n; i++) {
            k = (int) (Math.random() * (n-3) * 3 + 1);
            x[i] = (int) (Math.random() * k);
        }
        return x;
    }
}
