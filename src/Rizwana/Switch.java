package Rizwana;

import java.util.Scanner;

// An improved version of the season program.
class Switch {
    public static void main(String []args) {
        int month;
        Scanner in=new Scanner(System.in);
        month=in.nextInt();
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Bogus Month";
        };
        System.out.println("April is in the " + season + ".");
    }
}