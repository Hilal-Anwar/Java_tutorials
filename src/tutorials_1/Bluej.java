package tutorials_1;

import java.io.*;
import java.util.Arrays;

import static util.Util.println;

/*
20. Write a program to input a word and print its letters one below the other.
Input : BLUEJ
 */
public class Bluej {
    public static void main(String[] args) throws IOException {
        // File path is passed as parameter
        File file = new File(
                "C:\\Users\\hilal\\file.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        StringBuilder s= new StringBuilder();
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
            s.append(st);
        //System.out.println(s);
        println(countWords(s.toString()));
    }
    public static long countWords(String string){
        return Arrays.stream(string.split("[\\s.,\n\\d]")).
                filter(x->!x.equals("")).count();
    }
}
