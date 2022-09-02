package book;


import java.math.BigDecimal;

public class find {
    public static void main(String[] args) {
        //find_multiple(5412,6454,17);
        /*var t=random_array(100000000);
        long x=System.currentTimeMillis();
        System.out.println(find_max_in_array_n_O(t));
        System.out.println(System.currentTimeMillis()-x);
        long y=System.currentTimeMillis();
        System.out.println(find_max_in_array_n_O_(t));
        System.out.println(System.currentTimeMillis()-y);*/
        //improved_surd_form(Long.MAX_VALUE);
        long x = System.currentTimeMillis();
        System.out.println(Long.MAX_VALUE + "   " + 9659301829632L);
        improved_surd_form(9223372036854775807L);
        System.out.println(System.currentTimeMillis() - x);
        long y = System.currentTimeMillis();
        surd_form(25);
        System.out.println(System.currentTimeMillis() - y);
        //find_multiple(0,999999999,6975);
        // System.out.println(fibonacci_series(0,1,20,"0 1"));
    }

    static void find_multiple(int i, int j, int a) {
        var k = (((i - i % a) / a) + 1) * a;
        while (k <= j) {
            System.out.println(k);
            k = k + a;
        }
    }


    static int[] random_array(int n) {
        var x = new int[n];
        int k = (int) (Math.random() * n + 1);
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * k);
        }
        return x;
    }

    static void surd_form(long a) {
        long i = 2;
        long sq = 1;
        long k = 4;
        long p = 1;
        while (k <= a) {
            if (a % i == 0) {
                if (a % k == 0) {
                    a /= k;
                    sq *= i;
                } else {
                    a /= i;
                    p *= i;
                }
            } else {
                i += 1;
            }
            k = i * i;
        }
        System.out.println(sq + "" + "√" + (a * p));
    }

    static void improved_surd_form(long a) {
        long i = 2;
        long sq = 1;
        long k = 4;
        long num = (long) Math.sqrt(a);
        while (i <= num) {
            if (a % k == 0) {
                a /= k;
                sq *= i;
                num = (long) Math.sqrt(a);
            } else {
                i += 1;
            }
            k = i * i;
        }
        System.out.println(i);
        System.out.println(sq + "" + "√" + a);

    }

    static int find_max_in_array_n_O(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    static int find_max_in_array_n_O_(int[] a) {
        int e = a.length - 1;
        int max = a[0];
        int end = (e + 1) / 2;
        for (int i = 0; i < end; i++) {
            max = Math.max(Math.max(max, a[e]), a[i + 1]);
            e--;
        }
        return max;
    }

    static String fibonacci_series(int a, int b, int n, String s) {
        return n >= 0 ? fibonacci_series(b, a + b, n - 1, s + " " + (a + b)) : s;
    }

}

