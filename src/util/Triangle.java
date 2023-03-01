package util;

/**
 * @author hilal on 28-02-2023
 * @project Java_tutorials
 */
public class Triangle {
    public static void main(String[] args) {
        //_generatePythagorean_triplet(3,50);
        for (int i = 1; i <=10 ; i++) {
            for (int j = i+1; j <=100 ; j++) {
                System.out.println(i+"  "+j+"  "+(j*j-i*i)+"   "+(2*i*j)+"  "+(i*i+j*j));
            }
        }
    }

    private static void _generatePythagorean_triplet(int start, int end) {
        StringBuilder s = new StringBuilder();
        int m = (start - 1) / 2;
        int n = m + 1;
        int c=0;
        while ((n * n + m * m) <= end) {
            int i = n;
            for (; (m * m + i * i) <= end; i++) {
                System.out.println(i+"   "+m);
                s.append(i * i - m * m).append(" ").
                        append(2 * m * i).append(" ").
                        append(m * m + i * i).append("\n");
                c++;
            }
            m = m + 1;
            n = n + 1;
        }
        System.out.println(s);
        System.out.println(c);
    }
}

