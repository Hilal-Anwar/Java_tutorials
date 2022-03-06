import com.helal_anwar.Pattern;

public class EX
{
    public static void main(String[] args) {
        Pattern p = new Pattern("Hello",'▼',5);
        p.print();
        System.out.println();
        p.setStr("World");
        p.setChar('▲');
        p.print();
    }
}
