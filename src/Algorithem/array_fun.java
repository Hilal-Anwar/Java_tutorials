package Algorithem;

import java.util.Arrays;

public class array_fun {
    public static void main(String[] args) {
        //int[] a = new int[]{5, -54, 5, 5454, 5, 1, 9, 87, 26, 69, 98, 1, 3};
        int[][] a = randomArray(500000);
        long start = System.currentTimeMillis();
        var k1 = binary_sort(a[0]);
        //int[] b = new int[]{5, -54, 5, 5454, 5, 1, 9, 87, 26, 69, 98, 1, 3};
        //System.out.println(Arrays.toString(binary_sort(b)));
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        var k2 = algo(a[1]);
        System.out.println(System.currentTimeMillis() - start);
        //System.out.println(Arrays.toString(k1));
        //System.out.println(Arrays.toString(k2));

    }

    static int[] algo(int[] arr) {
        int[] nArr = new int[arr.length];
        nArr[0] = arr[0];
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            int c = 0;
            for (int value : nArr) {
                if (arr[i] == value) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                nArr[k] = arr[i];
                k++;
            }

        }
        return nArr;
    }

    private static int[][] randomArray(int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        for (int j = 0; j < n; j++) {
            int con = (int) (Math.random() * (n - j) + 2);
            a[j] = con;
            b[j] = con;
        }
        System.out.println("Array is filled");
        return new int[][]{a, b};
    }

    static int[] remove_repeated_element(int[] arr) {
        int[] nArr = new int[arr.length];
        int start, end, mid = 0, k = 0;
        nArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > nArr[k]) {
                nArr[k + 1] = arr[i];
                k++;
            } else if (arr[i] < nArr[0]) {
                System.arraycopy(nArr, 0, nArr, 1, k + 1);
                nArr[0] = arr[i];
                k++;
            } else if (nArr[0] != arr[i] && nArr[k] != arr[i]) {
                end = k;
                start = 0;
                while ((end - start) != 1) {
                    mid = (end + start) / 2;
                    if (arr[i] == nArr[mid])
                        break;
                    else if (nArr[mid] > arr[i])
                        end = mid;
                    else if (nArr[mid] < arr[i])
                        start = mid;
                }
                if (nArr[mid] < arr[i]) {
                    if (k + 1 - (mid + 1) >= 0)
                        System.arraycopy(nArr, mid + 1, nArr, mid + 1 + 1, k + 1 - (mid + 1));
                    nArr[mid + 1] = arr[i];
                    k++;
                } else if (nArr[mid] > arr[i]) {
                    if (k + 1 - mid >= 0)
                        System.arraycopy(nArr, mid, nArr, mid + 1, k + 1 - mid);
                    nArr[mid] = arr[i];
                    k++;
                }
            }

        }
        return nArr;
    }

    static int[] binary_sort(int[] arr) {
        int[] nArr = new int[arr.length];
        int start, end, mid = 0, k = 0;
        nArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= nArr[k]) {
                nArr[k + 1] = arr[i];
                k++;
            } else if (arr[i] <= nArr[0]) {
                System.arraycopy(nArr, 0, nArr, 1, k + 1);
                nArr[0] = arr[i];
                k++;
            } else {
                end = k;
                start = 0;
                while ((end - start) != 1) {
                    mid = (end + start) / 2;
                    if (arr[i] == nArr[mid]) {
                        if (k + 1 - (mid + 1) >= 0)
                            System.arraycopy(nArr, mid + 1, nArr, mid + 1 + 1, k + 1 - (mid + 1));
                        nArr[mid + 1] = arr[i];
                        k++;
                        break;
                    } else if (nArr[mid] > arr[i])
                        end = mid;
                    else if (nArr[mid] < arr[i])
                        start = mid;
                }
                if (nArr[mid] < arr[i]) {
                    if (k + 1 - (mid + 1) >= 0)
                        System.arraycopy(nArr, mid + 1, nArr, mid + 1 + 1, k + 1 - (mid + 1));
                    nArr[mid + 1] = arr[i];
                    k++;
                } else if (nArr[mid] > arr[i]) {
                    if (k + 1 - mid >= 0)
                        System.arraycopy(nArr, mid, nArr, mid + 1, k + 1 - mid);
                    nArr[mid] = arr[i];
                    k++;
                }
            }

        }
        return nArr;
    }
}
