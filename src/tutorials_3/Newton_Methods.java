package tutorials_3;

public class Newton_Methods {
    public static void main(String[] args) {
        System.out.println(sqrt(Double.MAX_VALUE));
        System.out.println(n_root(Double.MAX_VALUE,300000000.0));
        System.out.println(Math.pow(Double.MAX_VALUE,1.0/3000.0));
    }
    static double sqrt(double number){
        double sqrt=(number+1)/2;
        double tem=0;
        int k=0;
        while (tem!=sqrt){
            tem=sqrt;
            k++;
            sqrt=(number/tem+tem)/2;
        }
        System.out.println(k);
        return sqrt;
    }
    static double n_root(double number,double power){
        //System.out.println(number+"    "+power);
        double sqrt=(number+power-1)/power;
        //System.out.println(sqrt);
        double tem=0;
        int k=0;
        while (tem!=sqrt){
            tem=sqrt;
            k++;
            sqrt=(number/Math.pow(tem,power-1)+(tem*(power-1)))/power;
            System.out.println(sqrt);
        }
        //System.out.println(k);
        return sqrt;
    }
}
