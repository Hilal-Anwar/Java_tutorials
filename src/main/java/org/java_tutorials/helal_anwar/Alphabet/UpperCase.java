package main.java.org.jmath.helal_anwar.Alphabet;

public class UpperCase {
    public static String [][] space(int size){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
             a[i][j]=" ";
            }

        }
        return a;
    }
    public static String [][] A(int size, char s){
        String[][] a =new String[size][size*2];
        int k=size;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (j==k||j==(2*i+k)||(i==size/2 && j>=k && j<=(2*i-1+k)))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k--;
        }
        return a;
    }
    public static String [][] B(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||j==size*2-1||i==0||i==(size-1)/2||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][2*size-1]=" ";
        a[size-1][2*size-1]=" ";
        a[(size-1)/2][2*size-1]=" ";
        return a;
    }
    public static String[][] C(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||i==0||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        return a;
    }
      public static String[][] D(int size, char s){
          String[][] a =new String[size][size*2];
          for (int i = 0; i < size; i++) {
              for (int j = 0; j < size*2; j++) {
                  if (j==0||j==size*2-1||i==0||i==size-1)
                      a[i][j]= String.valueOf(s);
                  else a[i][j]=" ";
              }
          }
          a[0][2*size-1]=" ";
          a[size-1][2*size-1]=" ";
          return a;
    }
    public static String [][] E(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||i==0||i==(size-1)/2||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        return a;
    }
    public static String [][] F(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||i==0||i==(size-1)/2)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        return a;
    }
    public static String [][] G(int size, char s) {
        String[][] a = new String[size][size * 2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||i==0||(i==size-1 && j<=(2*size-3))||
                        (i==size/2 && j>=4 && j<=(2*size-3))||
                        (i>size/2 && j==2*size-3))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        a[size/2][2*size-3]=" ";
        a[size-1][2*size-3]=" ";
        return a;
    }
    public static String [][] H(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if ((j==0)||j==size*2-1||i==(size-1)/2)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        return a;
    }
    public static String [][] I(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (i==0||i==size-1||j==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        return a;
    }
    public static String [][] J(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (i==0||j==size||(i>=size/2 && j==size/2)||(i==size-1 && j>=size/2 && j<=size))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[size-1][size/2]=" ";
        a[size-1][size]=" ";
        return a;
    }
    public static String [][]K(int size, char s){
        String[][] a =new String[size][size*2];
        int k=size*2-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||j==k)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            if (i<size/2)
            k=k-4;
            else k=k+4;
        }
        return a;
    }
    public static String [][] L(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        return a;
    }
    public static String [][] M(int size, char s){
        String[][] a =new String[size][size*2];
        int k=0,k_1=2*size-1;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (j==0||j==2*size-1||j==k||j==k_1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k++;
            k_1--;
        }
        return a;
    }
    public static String [][] N(int size, char s){
        String[][] a =new String[size][size*2];
        int k=0;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (j==0||j==2*size-1||j==k)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k=k+2;
        }
        return a;
    }
    public static String[][] O(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||j==size*2-1||i==0||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        a[0][2*size-1]=" ";
        a[size-1][2*size-1]=" ";
        return a;
    }
    public static String [][]P(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||(j==size*2-1&& i<=(size-1)/2)||i==0||i==(size-1)/2)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][2*size-1]=" ";
        a[(size-1)/2][2*size-1]=" ";
        return a;
    }
    public static String[][] Q(int size, char s){
        String[][] a =new String[size][size*2];
        int k=size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||j==size*2-1||i==0||i==size-1||(i>=(size-1)/2 && j==k))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k++;
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        a[0][2*size-1]=" ";
        a[size-2][2*size-1]=" ";
        a[size-1][2*size-2]=" ";
        return a;
    }
    public static String [][]R(int size,char s){
        String[][] a =new String[size][size*2];
        int k=size/2-2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||(j==size*2-1&& i<=(size-1)/2)||i==0||i==(size-1)/2||(j==k && i>=size/2))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            if (i>=size/2)
                k=k+4;
        }
       a[0][2*size-1]=" ";
        a[(size-1)/2][2*size-1]=" ";
        return a;
    }
    public static String [][] S(int size,char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if ((j==0 && i<=(size-1)/2)||i==0||i==(size-1)/2||i==size-1||(i>=(size-1)/2 && j== 2*size-1))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][0]=" ";
        a[(size-1)/2][2*size-1]=" ";
        a[(size-1)/2][0]=" ";
        a[size-1][2*size-1]=" ";
        return a;
    }
    public static String [][] T(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (i==0||j==size)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        return a;
    }
    public static String [][] U(int size, char s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||j==2*size-1||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[size-1][0]=" ";
        a[size-1][2*size-1]=" ";
        return a;
    }
    public static String [][] V(int size, char s){
        String[][] a =new String[size][size*2];
        int k=0,k_1=2*size-1;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (j==k||j==k_1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k++;
            k_1--;
        }
        return a;
    }
    public static String [][] W(int size, char s){
        String[][] a =new String[size][size*2];
        int k=size;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (j==0||j==k||j==(2*size-1)||j==(2*i-1+k))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k--;
        }
        a[0][size-1]=" ";
        a[0][size]=" ";
        return a;
    }
    public static String [][] X(int size, char s){
        String[][] a =new String[size][size*2];
        int k=0,k_1=2*size-1;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (j==k||j==k_1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k=k+2;
            k_1=k_1-2;
        }
        return a;
    }
    public static String [][] Y(int size, char s){
        String[][] a =new String[size][size*2];
        int k=0,k_1=2*size-1;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if ((i<(size-1)/2 && (j==k||j==k_1))||(i>=(size-1)/2 && j==size))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k=k+2;
            k_1=k_1-2;
        }
        return a;
    }
    public static String [][] Z(int size, char s){
        String[][] a =new String[size][size*2];
        int k=2*size-1;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (i==0||j==k||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k=k-2;
        }
        a[0][2*size-1]=" ";
        a[size-1][0]=" ";
        return a;
    }
}
