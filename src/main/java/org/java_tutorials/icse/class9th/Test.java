package org.java_tutorials.icse.class9th;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mainDish = scanner.nextLine();
        int timeOfDay = scanner.nextInt();
        boolean hasVoucher = scanner.nextBoolean();
        boolean isCardPayment = scanner.nextBoolean();

        System.out.println(hasVoucher + " " + isCardPayment);

        int cost;
        if (mainDish.equals("paneer tikka")) {
            cost = 250;
        } else if (mainDish.equals("butter chicken")) {
            cost = 240;
        } else if (mainDish.equals("masala dosa")) {
            cost = 200;
        } else {
            System.out.println("Invalid main dish");
            System.exit(0);
            return; // To satisfy the compiler
        }

        double totalCost;
        if (timeOfDay >= 12 && timeOfDay <= 15) {
            totalCost = (1 - 0.15) * cost;
        } else {
            totalCost = cost;
        }

        if (hasVoucher) {
            totalCost *= 0.9;
        }

        if (isCardPayment) {
            double serviceCharge = 0.05 * totalCost;
            totalCost += serviceCharge;
        }

        System.out.printf("%.02f%n", totalCost);
    }
}
