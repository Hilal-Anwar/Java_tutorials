package Algorithem;

import java.io.*;
import java.util.Arrays;


class table {
    public static void main(String[] args) {
        var x = new table();
        x.tree_sort(randomArray(500));
        System.out.println(x);
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n + j);
        }
        System.out.println("Array is filled");
        return a;
    }

    void draw_line(int xLimit, int yLimit, int x, int y, double slope) {
        x = x + xLimit / 2;
        y = y + yLimit / 2;
        StringBuilder str = new StringBuilder();
        String ch = (slope < 0) ? "/" : "\\";
        if (slope == 0)
            ch = "-";
        if (Double.isNaN(slope))
            ch = "|";
        for (int i = 1; i <= yLimit; i++) {
            for (int j = 1; j <= xLimit; j++) {
                if (j == xLimit / 2)
                    str.append("|");
                else if (i == yLimit / 2)
                    str.append("-");
                else if ((Double.isNaN(slope) && j == x) || (i - y) == slope * (j - x))
                    str.append(ch);
                else
                    str.append(" ");
            }
            str.append("\n");
        }
        System.out.println(str);
    }

    void tree_sort(int[] a) {
        int[][] b = new int[2 * a.length][2];
        b[a.length] = new int[]{a[0], -1};
        int[][][] tree = new int[a.length][][];
        tree[0] = b;
        int[][] end_start = new int[a.length][];
        end_start[0] = new int[]{a.length, a.length};
        int f=0;
        for (int i = 1; i < a.length; i++) {
            f=add_branches(a, i, tree, end_start, f, 0);
        }
        //System.out.println(Arrays.deepToString(tree));
        //System.out.println(Arrays.deepToString(end_start));
    }

    private int add_branches(int[] a, int i, int[][][] tree, int[][] start_end, int filled_size, int index) {
        System.out.println(index);
        int start = start_end[index][0];
        int end = start_end[index][1];
        int mid;
        if (tree[index][start][0] >= a[i]) {
            start--;
            start_end[index][0] = start;
            tree[index][start][0] = a[i];
            tree[index][start][1] = -1;
        } else if (tree[index][end][0] <= a[i]) {
            end++;
            start_end[index][1] = end;
            tree[index][end][0] = a[i];
            tree[index][end][1] = -1;
        } else {
            while ((end - start) != 1) {
                mid = (end + start) / 2;
                if (a[i] == tree[index][mid][0]) {
                    start = mid;
                    break;
                } else if (tree[index][mid][0] > a[i])
                    end = mid;
                else if (tree[index][mid][0] < a[i])
                    start = mid;
            }
            if (tree[index][start][1] == -1) {
                filled_size++;
                int[][] b = new int[2 * a.length][2];
                b[a.length] = new int[]{a[i], -1};
                tree[filled_size] = b;
                start_end[filled_size] = new int[]{a.length, a.length};
                tree[index][start][1] = filled_size;
            } else {
                add_branches(a, i, tree, start_end, filled_size, tree[index][start][1]);
            }
        }
        return filled_size;
    }
}