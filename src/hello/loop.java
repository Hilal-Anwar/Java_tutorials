package hello;

public class loop
{
    public static void main(String[] args) {
        loop in=new loop();
        in.sum();
    }
    void sum(){
        System.out.println("Hello World");
        sum();
    }
}
