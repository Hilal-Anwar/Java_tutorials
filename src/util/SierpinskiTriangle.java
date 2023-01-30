package util;

/**
 * @author hilal on 31-01-2023
 * @project Java_tutorials
 */
public class SierpinskiTriangle {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        System.out.println(sierpinski_triangle(value));
    }

    public static String sierpinski_triangle(int size) {
        int start = size, end = size;
        StringBuilder s = new StringBuilder();
        long[] val = {};
        for (int i = 0; i <= size; i++) {
            int c = 0;
            int k = 0;
            val = pascal(val, 0, 0);
            for (int j = 0; j <= end; j++) {
                if (j >= start) {
                    if (c == 0) {
                        var num = val[k];
                        s.append(num == 1 ? val[k] : " ");
                        c = 1;
                        k++;
                    } else {
                        s.append(" ");
                        c = 0;
                    }
                } else s.append(" ");
            }
            start = start - 1;
            end = end + 1;
            s.append('\n');
        }
        return s.toString();
    }

    public static long[] pascal(long[] a, int index, int max_size) {
        long[] tem = new long[a.length + 1];
        tem[0] = 1;
        for (int i = 1; i < a.length; i++) {
            tem[i] = (a[i - 1] + a[i]) % 2;
        }
        tem[a.length] = 1;
        return (index < max_size) ? pascal(tem, index + 1, max_size) : tem;
    }
}
