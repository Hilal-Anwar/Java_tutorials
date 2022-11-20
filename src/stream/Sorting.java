package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static util.Util.*;

public class Sorting {
    public static void main(String[] args) {
        /*var a = new Integer[]{54, 9, 7, 6, 5};
        Arrays.sort(a, Comparator.naturalOrder());
        println(Arrays.toString(a));
        println(Arrays.binarySearch(a, -54));
        println(a);*/
        Sorting s=new Sorting();
        System.out.println(s.charFrequency("I love to coding"));
    }
    String charFrequency(String str) {
        var a = str.toCharArray();
        Arrays.sort(a);
        int count = 0;
        char val = a[0];
        var value = new StringBuilder();
        for (char c : a) {
            if (val != c) {
                value.append(val == ' ' ? "Space" + "=" + count + " , "
                        : val + "=" + count + " , ");
                val = c;
                count = 0;
            }
            count++;
        }
        value.append(a[a.length - 1]).append("=").append("1");
        return "{" + value + "}";
    }
}
