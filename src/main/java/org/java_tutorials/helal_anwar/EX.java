package main.java.org.jmath.helal_anwar;

public class EX
{
    public static void main(String[] args) {
        Pattern p = new Pattern("K",'@',5);
        p.print();
        System.out.println();
        p.setStr("World");
        p.setChar('*');
        p.print();
    }
}
