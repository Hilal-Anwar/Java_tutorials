package ramzanFoodChart;

import code.Complex;

import java.util.Arrays;

public class part {
    public static void main(String[] args) {
        System.out.println(pow(2,0));
       /* var complex = new Complex(1, 1);
        System.out.println(complex.division(new Complex(3, 2)));
        System.out.println(complex.product(new Complex(3, 2)));
        System.out.println(complex.add(new Complex(3, 2)));
        System.out.println(complex.subtract(new Complex(3, 2)));
        System.out.println(complex.modulus());
        System.out.println(complex.conjugate());
        System.out.println(complex.argument());
        System.out.println(complex.add(complex.conjugate()));

        complex = complex.
                add(complex).
                division(complex).
                inverse().
                conjugate().
                pow(3);
        System.out.println(complex);
        System.out.println(Arrays.deepToString(multiply(random_array(500),random_array(500))));*/
    }
    static int [][] multiply(int [][]a,int [][]b){
        int [][] c=new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            int []k=a[i];
            for (int j = 0; j < b[0].length; j++) {
                int []p=b[j];
                int sum=0;
                for (int l = 0; l < p.length; l++) {
                    sum=sum+(p[l]*k[l]);
                }
                c[i][j]=sum;
            }
        }
        return c;
    }
    static int [][] random_array(int size){
        int [][]c=new int [size][size];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
            c[i][j]=(int)(Math.random()*9+1);
            }
        }
        return c;
    }
    public static double pow(double x,int power) {
        var p = 1.0;
        var k = x;
        if (power >= 1)
            while (power >= 1) {
                if (power % 2 == 0) {
                    k = k*k;
                    power = power / 2;
                } else {
                    p = p*k;
                    power--;
                }
            }
        return p;
    }
}
