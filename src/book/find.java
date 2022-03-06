package book;



public class find {
    public static void main(String[] args) {
        //find_multiple(5412,6454,17);
        /*var t=random_array(100000000);
        long x=System.currentTimeMillis();
        System.out.println(find_max_in_array_n_O(t));
        System.out.println(System.currentTimeMillis()-x);
        long y=System.currentTimeMillis();
        System.out.println(find_max_in_array_n_O_(t));
        System.out.println(System.currentTimeMillis()-y);*/
        //surd_form(99999999);
        //find_multiple(0,999999999,6975);
        System.out.println(fibonacci_series(0,1,20,"0 1"));
    }
    static void find_multiple(int i,int j,int a){
        var k=(((i-i%a)/a)+1)*a;
        while (k<=j){
            System.out.println(k);
            k=k+a;
        }
    }


    static int [] random_array(int n){
        var x=new int[n];
        int k=(int)(Math.random()*n+1);
        for (int i = 0; i < n; i++) {
            x[i]=(int)(Math.random()*k);
        }
        return x;
    }
    static void surd_form(int a) {
        int i = 2;
        int j = 2;
        int sq = 1;
        while ((i * i) <= a) {
            if (a % (i * i) == 0) {
                a = a / (i * i);
                sq = sq * i;
            } else {
                j++;
                i = j;
            }
        }
        System.out.println(sq + "" + "√" + a);
    }
    static int find_max_in_array_n_O(int []a){
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            max=Math.max(max,a[i]);
        }
        return max;
    }
    static int find_max_in_array_n_O_(int []a){
       int e=a.length-1;
       int max =a[0];
        int end = (e + 1) / 2;
        for (int i = 0; i < end; i++) {
            max=Math.max(Math.max(max,a[e]),a[i+1]);
            e--;
        }
        return max;
    }
    static String fibonacci_series(int a,int b,int n,String s){
        return n >= 0 ? fibonacci_series(b, a + b, n - 1, s + " " + (a + b)) : s;
    }

}

