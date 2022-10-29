package stream;

import java.util.Arrays;
import java.util.Comparator;

import static util.Util.*;

public class Sorting {
    public static void main(String[] args) {
        var a=new Integer[]{54,9,7,6,5};
        Arrays.sort(a, Comparator.naturalOrder());
        println(Arrays.toString(a));
        println(Arrays.binarySearch(a,-54));
        println(a);
    }
}
