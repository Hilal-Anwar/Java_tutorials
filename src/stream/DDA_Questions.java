package stream;

import java.util.ArrayList;
import java.util.Arrays;

import static util.Util.*;


public class DDA_Questions {
    public static void main(String[] args) {
        var t = findSaddlePoint(new int[][]{{4, 5, 6}, {7, 8, 9}, {5, 1, 3}});
        for (var z : t) {
            System.out.println(Arrays.toString(z));
        }
    }

    public static ArrayList<int[]> findSaddlePoint(int[][] arr) {
        var saddlePoint = new ArrayList<int[]>();
        for (int[] ints : arr) {
            var min = findMin(ints);
            var tem = getColumn(arr, min.index());
            var max = findMax(tem);
            if (arr[max.index()][min.index()] == min.value())
                saddlePoint.add(new int[]{min.value(), min.index(), max.index()});
        }
        return saddlePoint;
    }
}
