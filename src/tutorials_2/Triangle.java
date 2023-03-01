package tutorials_2;

import java.util.Scanner;

/*
9. Write a program to enter three sides of a triangle and check whether is PYTHOGORIAN TRIPLATE or
not
Example:
Input: 3, 4, 5
Reason: 52=32+42
Output: PYTHOGORIAN TRIPLATE
 */
public class Triangle
{
    public static void main(String[] args) {
        PYTHOGORIAN_TRIPLATE(50);
    }
    public static void PYTHOGORIAN_TRIPLATE(int n){
        for (int i = 3; i <=n ; i++) {
            for (int j = i-1; j >=3 ; j--) {
                for (int k = j-1; k >=3 ; k--) {
                    if (i*i==k*k+j*j){
                        System.out.println(k+" "+j+" "+i);
                    }
                }
            }
        }
    }
}
