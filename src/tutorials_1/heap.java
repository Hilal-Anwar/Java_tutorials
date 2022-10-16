package tutorials_1;

import java.util.Arrays;
import java.util.HashSet;

public class heap {
    static HashSet<String> s = new HashSet<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        permutation_heaps_algo();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(s.size());
    }

    private static void permutation_heaps_algo() {
        int[] A = {1, 2, 3, 4};
        // make idx array with zeros
        int[] idx = new int[A.length];
        Arrays.fill(idx, 0);

        // print first permutation
        //System.out.println(Arrays.toString(A));
        //s.add(Arrays.toString(A));
        // heap's algorithm, iterative
        for (int i = 1; i < A.length; ) {
            //System.out.println(Arrays.toString(idx) + " " + i + "   ");
            if (idx[i] < i) {
                int swap = (i % 2 == 0) ? 0 : idx[i];
                int tmp = A[swap];
                A[swap] = A[i];
                A[i] = tmp;

                // print this permutation
                System.out.println(Arrays.toString(A));
                //s.add(Arrays.toString(A));
                idx[i] = idx[i] + 1;
                i = 1;
            } else {
                idx[i] = 0;
                i++;
            }
        }
    }
}
