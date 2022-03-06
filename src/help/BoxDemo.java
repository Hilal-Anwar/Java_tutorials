package help;
public class BoxDemo
{
    public static void main(String[] args) {
        Box Object=new Box(50,45,47);
        System.out.println(Object.height*Object.length*Object.width);
        Object=new Box(200,5,0.1);
        System.out.println(Object.height*Object.length*Object.width);
    }
}
