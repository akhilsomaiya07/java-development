package com.pluralsight;

import java.util.Scanner;

public class PresentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the monthly payout, expected interest rate, and years to pay out
        System.out.print("Enter the monthly payout: $");
        double monthlyPayout = scanner.nextDouble();

        System.out.print("Enter the expected annual interest rate (e.g., 2.5% as 2.5): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years to pay out: ");
        int yearsToPayOut = scanner.nextInt();

        // Convert the annual interest rate to a monthly interest rate (as a decimal)
        double monthlyInterestRate = (annualInterestRate / 12) / 100;

        // Calculate the number of monthly payments
        int numberOfPayments = yearsToPayOut * 12;

        // Calculate the present value of the annuity
        double presentValue = monthlyPayout * ((1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)) / monthlyInterestRate);

        // Display the result
        System.out.printf("To fund an annuity that pays $%.2f monthly for %d years and earns an expected %.2f%% interest, you would need to invest $%.2f today.%n",
                monthlyPayout, yearsToPayOut, annualInterestRate, presentValue);

        scanner.close();
    }
}