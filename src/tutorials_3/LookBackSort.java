package tutorials_3;

import java.util.Arrays;

public class LookBackSort {
    public static void main(String[] args) {
        int []num=randomArray(100000); //array
        for (int i = 0; i < num.length-1; i++)
        {
            for (int j = i+1; j >= 1; j--)
            {
                if (num[j]>num[j-1])
                {
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
                else break;
            }
        }
        //for printing the array
        System.out.println(Arrays.toString(num));
    }

    private static int[] randomArray(int n) {
        int [] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=(int)(Math.random()*i);
        }
        System.out.println("The array is filled");
        return a;
    }
}
