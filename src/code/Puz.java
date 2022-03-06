package code;

import java.io.IOException;

public class Puz {
    public static void main(String[] args) throws IOException, InterruptedException {
        int r=0;
        Draw(30,24);
        while(true){
        Draw(30,r);
        r=(r<29)?r+1:0;
        clrscr();
        }
    }

    private static boolean donut(double x, double y, double R, double r) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(R, 2) - 2 * R * (x + y)) <= 0
                && (Math.pow(x, 2) + Math.pow(y, 2) + 2 * Math.pow(R, 2) - 2 * R * (x + y)) >= r * r;
    }

    private static void Draw(double R, double r) {
        String shape = "";
        for (double i = 0; i <= 2 * R; i++) {
            for (double j = 0; j <= 2 * R; j++) {
                char x = (char) (Math.random() * 57 + 65);
                if (donut(j, i, R, r))
                    shape = shape + "*" + " ";
                else shape = shape + "  ";
            }
            shape = shape + '\n';
        }
        System.out.println(shape);
    }
    public static void clrscr() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
