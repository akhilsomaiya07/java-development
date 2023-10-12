package com.pluralsight;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the initial deposit amount: $");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble() / 100.0;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundingFrequency = scanner.nextInt();

        // Calculate the future value and total interest earned
        double futureValue = principal * Math.pow(1 + (annualInterestRate / compoundingFrequency), compoundingFrequency * years);
        double totalInterestEarned = futureValue - principal;

        // Display the results
        System.out.printf("Your CD's ending balance will be $%.2f%n", futureValue);
        System.out.printf("You would have earned $%.2f in interest%n", totalInterestEarned);

        // Close the scanner
        scanner.close();
    }
}
