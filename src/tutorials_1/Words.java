package tutorials_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Write a program to input a sentence and count the number of words.
 */
public class Words {
    public static void main(String[] args) throws IOException {
        var read=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String str=read.readLine();
        int start=0;
        int count=0;
        int previous=0;
        while (str.indexOf(" ", start) != -1) {
            if(str.indexOf(" ", start)-previous>1){
                count++;
            }
            previous=str.indexOf(" ", start);
            start = str.indexOf(" ", start) + 1;
        }
        System.out.println("Total number of words are : "+(count+1));
    }
}
