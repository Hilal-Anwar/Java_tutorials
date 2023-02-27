package tutorials_12;

import java.util.Arrays;

public class numbers {
    public static void main(String[] args) {
        String[] Num = {"1", "5697", "97874", "9813"};
        for (String s : Num) {
            char a = s.charAt(s.length() - 1);
            if ('2' == a || a == '4' || a == '6' || a == '8' || a == '0')
                System.out.println(s);
        }
        System.out.println(order(2976));
        var t = new int[]{20, 31, 11, 12, 13, 24, 21, 37, 12, 15, 24, 28, 28, 29, 3, 19, 15, 5, 8, 9};
        System.out.println("[8, 5, 3, 9, 15, 12, 21, 11, 24, 12, 15, 13, 19, 20, 28, 29, 28, 24, 31, 37]");
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(hashing(t)));
    }

    static String order(int n) {
        int p = n % 10;
        int q = n % 100;
        int diff = p - q / 10;
        int r;
        int c = 0, k = 0;
        n = n / 10;
        while (n > 9) {
            p = n % 10;
            q = n % 100;
            r = p - q / 10;
            c = r < 0 &&
                    diff < 0 ? 1 : 0;
            k = r > 0 &&
                    diff > 0 ? 1 : 0;
            n = n / 10;
        }
        return c == 1 ?
                "descending order" :
                k == 1 ?
                        "ascending order" :
                        "no order";
    }

    static int[] hashing(int[] a) {
        int size = a.length - 1;
        int[] hashed = new int[a.length];
        Object[] dummy = new Object[a.length];
        int index = 0;
        while (index <= size) {
            int val = a[index];
            int v = Math.abs(val % 10);
            int d = v > size ? 0 : v;
            if (dummy[d] == null) {
                hashed[d] = val;
                dummy[d] = val;
            } else {
                int k = d;
                while (dummy[d] != null) {
                    d = (d == size) ? 0 : d + 1;
                }
                if (d > k) {
                    for (int i = d; i > k; i--) {
                        dummy[i] = dummy[i - 1];
                        hashed[i] = hashed[i - 1];
                    }
                } else if (d < k) {
                    for (int i = d; i >= 1; i--) {
                        dummy[i] = dummy[i - 1];
                        hashed[i] = hashed[i - 1];
                    }
                    dummy[0] = dummy[size];
                    hashed[0] = hashed[size];
                    for (int i = size; i > k; i--) {
                        dummy[i] = dummy[i - 1];
                        hashed[i] = hashed[i - 1];
                    }
                }
                dummy[k] = val;
                hashed[k] = val;
            }
            index++;
        }
        return hashed;
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n + j);
        }
        System.out.println("Array is filled");
        return a;
    }
}
