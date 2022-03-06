package hello;

public class numbers
{
    public static void main(String[] args) {
        String []Num={"1","5697","97874","9813"};
        for (String s : Num) {
            char a = s.charAt(s.length() - 1);
            if ('2' == a || a == '4' || a == '6' || a == '8' || a == '0')
                System.out.println(s);
        }
    }
}
