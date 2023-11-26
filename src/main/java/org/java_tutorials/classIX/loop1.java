package org.java_tutorials.classIX;

import jdk.jshell.JShell;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try (var x = JShell.create()) {
            var c=x.eval("1+2").get(0).value();
            System.out.println("Enter your expression");
            String ex = in.nextLine();
            System.out.println(x.eval(ex).get(0).value());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
