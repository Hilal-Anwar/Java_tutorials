package tutorials_11;

public class B extends A {
    public static void main(String[] args) {
        B ob=new B();
        ob.message();
    }
    void message(){
        System.out.println("Your name is "+name);
    }
}
