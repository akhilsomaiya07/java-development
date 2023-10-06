package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Display available operations and ask for user's choice
        System.out.println("\nAvailable operations:");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");
        System.out.print("Please select an operation: ");
        char operation = Character.toUpperCase(input.next().charAt(0)); // Convert to uppercase

        // Perform the selected operation and display the result
        switch (operation) {
            case 'A':
                double additionResult = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + additionResult);
                break;
            case 'S':
                double subtractionResult = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + subtractionResult);
                break;
            case 'M':
                double multiplicationResult = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);
                break;
            case 'D':
                if (num2 != 0) {
                    double divisionResult = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + divisionResult);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}

