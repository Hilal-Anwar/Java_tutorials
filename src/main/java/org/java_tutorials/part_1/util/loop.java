package org.java_tutorials.part_1.util;


import static org.java_tutorials.part_1.util.Util.*;

public class loop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 90000) {
            print(i % 30 == 0 ? '\n' : (char) i + " ");
            i++;
        }
    }
}
