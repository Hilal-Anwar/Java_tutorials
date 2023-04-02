package tutorials_3;

class Puz{
    public static void main(String[] args) 
    throws InterruptedException {
        int r = 0;
        //Draw(30, 24);
        while (true) {
            Draw(25, r);
            r = (r < 25) ? r + 1 : 0;
            Thread.sleep(150);
            clrscr();
        }
    }

    private static boolean donut(double x, double y,
     double R, double r) {
        
        return (Math.pow(x, 2) +
                Math.pow(y, 2) +
                Math.pow(R, 2) - 2 * R * (x + y)) <= 0
                && (Math.pow(x, 2) +
                Math.pow(y, 2) + 2 *
                Math.pow(R, 2) - 2 * R * (x + y)) >= r * r;
    }

    private static void Draw(double R, double r) {
        StringBuilder shape = new StringBuilder();
        for (double i = 0; i <= 2 * R; i++) {
            for (double j = 0; j <= 2 * R; j++) {
                char x = (char) (Math.random() * 57 + 65);
                if (donut(j, i, R, r))
                    shape.append(getText(x+"")).
                    append(" ");
                else shape.append("  ");
            }
            shape.append('\n');
        }
        System.out.println();
        System.out.println();
        System.out.println(shape.toString().indent(5));
    }

    public static void clrscr() {
        System.out.print("\033[H\033[J");
    }

    public static String getText(String s) {
        return Color.valueOf("" + 
        Color.values()[(int) (Math.random() * 8)])
        .getColor() + s + "\33[0m";
    }


}
enum Color {
    RED("\033[0;31m"),   // RED
    GREEN("\033[0;32m"),   // GREEN
    YELLOW("\033[0;33m"),  // YELLOW
    BLUE("\033[0;34m"),    // BLUE
    PURPLE("\033[0;35m"),  // PURPLE
    CYAN("\033[0;36m"),  // CYAN
    WHITE("\033[0;97m"),  // WHITE
    CYAN_BRIGHT("\033[0;96m");
    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}