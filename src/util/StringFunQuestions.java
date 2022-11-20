package util;

import java.io.IOException;
import java.util.Arrays;

import static util.Util.println;

class StringFunQuestions {
    public static void main(String[] args) {
        var count = new StringFunQuestions();
        String s = "I love to code";
        println("No of words =" + count.countWords(s));
    }

    long countWords(String str) {
        return Arrays.
                stream(str.split("[\\s.,\n\\d]")).
                filter(x -> !x.equals("")).count();
    }


    String charFrequency(String str) {
        var a = str.toCharArray();
        Arrays.sort(a);
        int count = 0;
        char val = a[0];
        var va = new StringBuilder();
        for (char c : a) {
            if (val != c) {
                va.append(val).
                        append("=")
                        .append(count)
                        .append(" ,");
                val = c;
                count = 0;
            }
            count++;
        }
        va.append(a[a.length - 1]).
                append("=").append("1")
                .append(",");
        return va.toString();
    }
}
