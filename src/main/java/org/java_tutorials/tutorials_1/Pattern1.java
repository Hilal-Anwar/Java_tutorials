package org.java_tutorials.tutorials_1;

/*
9.Create a class to print following pattern(using loops) :-
1234
1234
1234
1234
 */
public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j<= 4; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
