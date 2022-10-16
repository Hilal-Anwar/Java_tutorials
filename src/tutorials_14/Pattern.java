package tutorials_14;



public class Pattern {
    public static void main(String[] args) {
        String[][] a = new String[9][9];
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j >= i) {
                    a[j][i] = "" + k;
                    if (i % 2 == 0)
                        k++;
                    else k--;
                } else a[j][i] = "";
            }
            if (i % 2 == 0)
                k = a.length;
            else k = k + 2;
        }
        for (String[] strings : a) {
            for (String s:strings) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
