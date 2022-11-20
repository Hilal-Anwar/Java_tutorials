package tutorials_1;

import java.io.*;
import java.util.Arrays;

import static util.Util.println;


public class Bluej {
    public static void main(String[] args) throws IOException {
        String sentence="I love to code";
        println("The number of words in your sentence are "+countWords(sentence));
    }

    public static long countWords(String string) {
        return Arrays.stream(string.split("[\\s.,\n\\d]")).
                filter(x -> !x.equals("")).count();
    }
}
