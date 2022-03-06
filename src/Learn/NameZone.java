package Learn;
// // this  program allow you to play the game of name with computer so think a name


import java.util.Scanner;

class NameZone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int i, j, z;
        int c = 0, r = 0, d = 0;
        System.out.println(space(28)+"WELCOME TO NAME ZONE EVERYONE ");
        System.out.println();
        do {
            System.out.println("Think a name and enter the number words in your name");
            n = Integer.parseInt(in.nextLine());
            int[] a;
            a = new int[n];
            int[] b = new int[n];
            char[][] m = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'},
                    {'K', 'L', 'M', 'N', 'O',}, {'P', 'Q', 'R', 'S', 'T'}, {'U', 'V', 'W', 'X', 'Y'},
                    {'Z', ' ', ' ', ' ', ' '}};
            if (n > 0) {
                System.out.println(space(28)+"NOW ANSWER COLUMN WISE");
                System.out.println("THE MATRIX");
                for (int s = 1; s <= n; s++) {
                    for (i = 0; i < 6; i++) {
                        System.out.print(space(36));
                        for (j = 0; j < 5; j++) {
                            System.out.print(m[i][j] + " ");
                        }
                        System.out.println();
                    }

                    for (int t = 0; t <= 4; t++) {
                        System.out.println("If your" + " " + s + " th " + "letter of the name present in " + " " + (t + 1) + " " + "column if,yes enter 1 other wise 0 ");
                        int q = Integer.parseInt(in.nextLine());

                        if (q == 1) {
                            a[c] = t;
                            c++;
                            break;
                        } else
                            d++;

                    }

                }
            }
            if (n > 0) {
                System.out.println(space(28)+"NOW ANSWER ROW WISE");
                for (int s = 1; s <= n; s++) {
                    for (i = 0; i < 6; i++) {
                        System.out.print(space(36));
                        for (j = 0; j < 5; j++) {
                            System.out.print(m[i][j] + " ");
                        }
                        System.out.println();
                    }

                    for (int t = 0; t <= 5; t++) {
                        System.out.println("If your " + " " + s + " th " + "letter of the name present in  " + (t + 1) + " row if yes enter 1 other wise 0");
                        int q = Integer.parseInt(in.nextLine());
                        if (q == 1) {
                            b[r] = t;
                            r++;
                            break;
                        } else
                            d++;

                    }
                }
            }
            r = 0;
            c = 0;
            if (n > 0 && d != (11 * n)) {
                System.out.println(space(28)+"the name that you thought was");
                System.out.println();

                for (i = 0; i < n; i++) {
                    c = a[i];
                    r = b[i];
                    System.out.print(m[r][c]);
                }
            } else
                System.out.println("sorry you did not thought any name because no name can be of size  " + n + " and with no letters");
            System.out.println();
            System.out.println("enter 1 to continue and any other to number exit");
            z = Integer.parseInt(in.nextLine());
            if (z != 1)
                System.out.println("THANKS FOR USING IT");
            d = 0;
        }
        while (z == 1);
    }
    public static String space(int n){
       String s="";
        for (int i = 0; i < n; i++) {
            s=s+" ";
        }
        return s;
    }
}