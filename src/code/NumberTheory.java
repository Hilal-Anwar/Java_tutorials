package code;

public class NumberTheory
{
    public static void main(String[] args) {
        if(perfect_square(256))
            System.out.println("Perfect square");
        else System.out.println("Not a perfect square");
    }

    private static boolean perfect_square(int num) {
        return (Math.sqrt(num)==(int)Math.sqrt(num));
    }
}
