package Algorithem;

class Pattern1 {
    public static void main(String[] args) {
        var s = binary_pascal();
        System.out.println(s);
    }

    private static String binary_pascal() {
        int size = 20;
        int f;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            s.append(" ".repeat(Math.max(0, size - i)));
            f = 1;
            s.append(f).append(" ");
            for (int j = 1; j <= i; j++) {
                f *= ((double) (i - j + 1) / j);
                s.append(f % 2).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
