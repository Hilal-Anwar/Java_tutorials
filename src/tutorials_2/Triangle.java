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
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        PYTHOGORIAN_TRIPLATE(a);
    }
    public static void PYTHOGORIAN_TRIPLATE(int n){
        for (int i = 3; i <=n ; i++) {
            for (int j = i-1; j >=3 ; j--) {
                for (int k = j-1; k >=3 ; k--) {
                    if (i*i==k*k+j*j){
                        System.out.println(i+" "+j+" "+k+" sin: "+Math.toDegrees(Math.asin(1.0*j/i))+" cos: "+Math.toDegrees(Math.acos(1.0*k/i))+" tan: "+Math.toDegrees(Math.atan(1.0*j/k)));
                    }
                }
            }
        }
    }
}
