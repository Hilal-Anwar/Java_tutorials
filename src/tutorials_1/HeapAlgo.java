package tutorials_1;

import java.util.HashSet;

class HeapAlgo {
    // Prints the array
    static int c = 0;
    static HashSet<String> k = new HashSet<>();

    // Driver tutorials_3
    public static void main(String[] args) {
        HeapAlgo obj = new HeapAlgo();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long start = System.currentTimeMillis();
        obj.heapPermutation(a, a.length, a.length);
        System.out.println(System.currentTimeMillis() - start);
    }

    void printArr(int[] a, int n) {
        /*for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();*/
    }

    // Generating permutation using Heap Algorithm
    void heapPermutation(int[] a, int size, int n) {
        // if size becomes 1 then prints the obtained
        // permutation
        if (size == 1)
            printArr(a, n);
        else {
            for (int i = 0; i < size; i++) {
                heapPermutation(a, size - 1, n);
                // if size is odd, swap 0th i.e (first) and
                // (size-1)th i.e (last) element
                int temp;
                if (size % 2 != 0) {
                    temp = a[0];
                    a[0] = a[size - 1];
                }

                // If size is even, swap ith
                // and (size-1)th i.e last element
                else {
                    temp = a[i];
                    a[i] = a[size - 1];
                }
                a[size - 1] = temp;
            }
        }
    }
}
