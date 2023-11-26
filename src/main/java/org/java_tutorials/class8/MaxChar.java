package org.java_tutorials.class8;


import java.util.ArrayList;

public class MaxChar {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(-434);
        list.add(867);
        list.remove(Integer.valueOf(5));
        System.out.println(list);
    }
}
