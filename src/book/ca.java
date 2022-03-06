package book;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ca {

    public static void main(String[] args) throws IOException {
        int num1;
        int num2;
        var in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("oye number dal");
        num1 = Integer.parseInt(in.readLine());
        System.out.println("oye dusra number dal");
        num2 = Integer.parseInt(in.readLine());
        System.out.println("oye operation dal");
        String operation = in.readLine();
        System.out.println(operation+"        "+num1+"    "+num2);
        if (operation.equals("+")) {
            System.out.println("tera answer hai" + (num1 + num2));
        }
        else if (operation.equals("-")) {
            System.out.println("your answer is" + (num1 - num2));
        }

        else if (operation.equals("/")) {
            System.out.println("your answer is" + (num1 / num2));
        }
        else if (operation.equals("*")) {
            System.out.println("your answer is" + (num1 * num2));
        }


    }
}