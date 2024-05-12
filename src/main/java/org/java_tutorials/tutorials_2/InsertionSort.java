package org.java_tutorials.tutorials_2;
// Java program for implementation of Insertion Sort
public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int[] arr = {-20, 1, 5, -4, -26, 7, 12, 9, 59, 70};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
    private static int[] randomArray(int n) {
        int [] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=(int)(Math.random()*i*i+i);
        }
        System.out.println("The array is filled");
        return a;
    }
}



