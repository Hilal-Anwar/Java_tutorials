package stream;

import java.util.ArrayList;
import java.util.Arrays;

import static util.Util.*;


public class DDA_Questions {
    public static void main(String[] args) {
       int a[][]=new int[3][3];
       int b[]={5,9,6};
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
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
