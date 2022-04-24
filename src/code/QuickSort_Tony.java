package code;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_Tony {
    public static void main(String[] args) {
        int[] x = /*new int[]{8, 45, 85, 78, 83, 87, 46, 43, 16, 24};*/randomArray1(10000000);
        //System.out.println(Arrays.toString(x));
        long start=System.currentTimeMillis();
        sort1(x);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(Arrays.toString(x));
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n+j);
        }
        System.out.println("Array is filled");
        return a;
    }
    private static int[] randomArray1(int n) {
        int []a=new int[n];
        for (int j = 0; j <n; j++) {
            a[j]=(int)(Math.random()*(n*n-Math.random()*n));
        }
        System.out.println("Array is filled");
        return a;
    }
    private static void sort(int[] a) {
        var points = new ArrayList<Integer[]>();
        points.add(new Integer[]{0, a.length-1});
        for (int z = 0; z < points.size(); z++) {
            Integer[] k = points.get(z);
            int start = k[0];
            int end = k[1];
            int pivot = a[(start + end) / 2];
            int i = start - 1;
            int j = end + 1;
            while (true) {
                do {
                    i = i + 1;
                } while (a[i] < pivot);
                do {
                    j = j - 1;
                } while (a[j] > pivot);
                if (i >= j) {
                    break;
                }
                int tem = a[i];
                a[i] = a[j];
                a[j] = tem;
                //System.out.println(i+"   "+j +"   "+Arrays.toString(a));
            }
            if (j - start >= 1)
                points.add(new Integer[]{start, j});
            if (end - j >= 1)
                points.add(new Integer[]{j + 1, end});
        }
        System.out.println(points.size());
        System.out.println("Sorted");
        //System.out.println(Arrays.toString(a));
    }
    private static void sort1(int[] a) {
        var points = new int[a.length*2][2];
        points[0]=new int[]{0, a.length - 1};
        int filled_sized=1;
        for (int z = 0; z < filled_sized; z++) {
            int[] k = points[z];
            int start = k[0];
            int end = k[1];
            int pivot = a[(start + end) / 2];
            int i = start - 1;
            int j = end + 1;
            while (true) {
                do {
                    i = i + 1;
                } while (a[i] < pivot);
                do {
                    j = j - 1;
                } while (a[j] > pivot);
                if (i >= j) {
                    break;
                }
                int tem = a[i];
                a[i] = a[j];
                a[j] = tem;
            }
            if (j - start >= 1){
                points[filled_sized+1]=new int[]{start, j};
                 filled_sized++;
            }
            if (end - j >= 1){
                points[filled_sized+1]=new int[]{j + 1, end};
            }
        }
        System.out.println("Sorted");
        //System.out.println(Arrays.toString(a));
    }

    private static int[][] addElement(int[][] arr, int[] element) {

        int[][] newArray = new int[arr.length + 1][];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length] = element;
        return newArray;
    }
}
