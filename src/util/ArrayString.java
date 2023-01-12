package util;

import java.util.Arrays;

/**
 * @author hilal on 11-01-2023
 * @project Java_tutorials
 */
public class ArrayString {
    public static void main(String[] args) {
        String s = "Mahendra Singh Pansingh Dhoni";
        System.out.println(s.endsWith("Dhoni"));
        System.out.println(isAllElementsEqual(new int[]{5, 3}, new int[]{3, 5}));
    }

    public static boolean isAllElementsEqual(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return a.length == b.length
                && Arrays.equals(a, b);
    }
}
