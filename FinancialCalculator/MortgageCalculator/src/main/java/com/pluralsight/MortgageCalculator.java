package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter the principal amount: $");
        double principal = input.nextDouble();
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the loan length (in years): ");
        int loanLength = input.nextInt();

        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate the number of monthly payments
        int numberOfPayments = loanLength * 12;

        // Calculate monthly payment using the compound interest formula
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Calculate total interest paid
        double totalInterest = (monthlyPayment * numberOfPayments) - principal;

        // Output the result
        System.out.printf("A $%.2f loan at %.2f%% interest for %d years would have a $%.2f monthly payment with a total interest of $%.2f.%n",
                principal, annualInterestRate, loanLength, monthlyPayment, totalInterest);

        input.close();
    }
}