package Algorithem;

import java.io.*;
import java.util.Arrays;


class table {
    public static void main(String[] args) {
        var x = new table();
        long a=System.currentTimeMillis();
        x._tree_sort(/*new int[]{5, -54, 5, 5454, 5, 1, 9, 87, 26, 69, 98, 1, 3}*/randomArray(1000000));
        System.out.println(System.currentTimeMillis()-a);
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
        int[][] start_end = new int[a.length][];
        start_end[0] = new int[]{a.length, a.length};
        int index=0,filled_index=0;
        for (int i = 1; i < a.length;) {
            //System.out.println(i+"\t"+index);
             int start=start_end[index][0];
             int end=start_end[index][1];
            if (tree[index][start][0] >= a[i]) {
                start--;
                start_end[index][0] = start;
                tree[index][start][0] = a[i];
                tree[index][start][1] = -1;
                i++;
            } else if (tree[index][end][0] <= a[i]) {
                end++;
                start_end[index][1] = end;
                tree[index][end][0] = a[i];
                tree[index][end][1] = -1;
                i++;
            }
            else {
                //System.out.println("llll");
                //System.out.println(start+"\t"+end+"\t"+a[i]);
                int mid;
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
               // System.out.println(start+"\t"+end);
                if (tree[index][start][1] == -1) {
                    //System.out.println("kkkk");
                    filled_index++;
                    int[][] bu = new int[2 * a.length][2];
                    bu[a.length] = new int[]{a[i], -1};
                    tree[filled_index] = bu;
                    //System.out.println(Arrays.deepToString(tree));
                    start_end[filled_index] = new int[]{a.length, a.length};
                    tree[filled_index-1][start][1] = filled_index;
                    i++;
                    index=0;
                } else {
                   index= tree[index][start][1];
                }
            }

        }
        //System.out.println(Arrays.deepToString(tree));
        //System.out.println(Arrays.deepToString(start_end));

    }
    void _tree_sort(int []a){
        int[][][] tree = new int[a.length][][];
        tree[0] = new int[][]{new int[]{a[0], -1}};
        int filled_index=0;
        int index=0;
        int i = 1;
        while (i < a.length) {
            int size=tree[index].length;
            int start=0;
            int end=size-1;
            if (tree[index][start][0] >= a[i]) {
                int[][] dummy_array =new int[size+1][];
                var temp=tree[index];
                System.arraycopy(temp, 0, dummy_array, 1, temp.length);
                dummy_array[0]=new int[]{a[i],-1};
                tree[index]=dummy_array;
                i++;
                index=0;

            } else if (tree[index][end][0] <= a[i]) {
                int[][] r =new int[size+1][];
                var t=tree[index];
                System.arraycopy(t, 0, r, 0, r.length - 1);
                r[r.length-1]=new int[]{a[i],-1};
                tree[index]=r;
                i++;
                index=0;
            }
            else {
                int mid;
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
                    filled_index++;
                    int[][] dummy_array = new int[1][2];
                    dummy_array[0] = new int[]{a[i], -1};
                    tree[filled_index] = dummy_array;
                    tree[index][start][1] = filled_index;
                    i++;
                    index=0;
                } else {
                    index= tree[index][start][1];
                }
            }
        }
    }
}