package class9;



public class Rotate {
    public static void main(String[] args) {
        int [][] a=new int[10][5];
        int k=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=k;
                k++;
            }
        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        a=rotate_90(a);
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    private static int [][] rotate_90(int[][] a){
        var b=new int[a[0].length][a.length];
        for (int i = a.length-1; i >=0; i--) {
            var k=a[i];
            for (int j = 0; j <k.length; j++) {
                b[j][a.length-1-i]=k[j];
            }
        }
        return b;
    }
}
