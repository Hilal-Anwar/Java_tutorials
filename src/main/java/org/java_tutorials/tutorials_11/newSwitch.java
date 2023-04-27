package org.java_tutorials.tutorials_11;

import java.util.Scanner;

public class newSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the days of week");
        var in = new Scanner(System.in);
        String day = in.nextLine();
        switch (day) {
            case "Monday" -> System.out.println("This the first day of the week");
            case "Tuesday" -> System.out.println("This the second day of the week");
            case "Wednesday" -> System.out.println("This the third day of the week");
            case "Thursday" -> System.out.println("This the fourth day of the week");
            case "Friday" -> System.out.println("This the fifth day of the week");
            case "Saturday" -> System.out.println("This the sixth day of the week");
            case "Sunday" -> System.out.println("This the seventh day of the week");
            default -> System.out.println("Invalid input");
        }
    }
}
