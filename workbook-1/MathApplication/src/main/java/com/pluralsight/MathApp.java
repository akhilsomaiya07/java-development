package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Find and display the largest of two variables named job1Salary and job2Salary using Math.max().
        // Set the variables to any value you want.
        double bobSalary = 55000.0;
        double garySalary = 65000.0;
        double highestSalary = Math.max(55000.0, 65000.0);
        System.out.println("The highest salary is " + highestSalary);

        // Find and display the smallest of two variables named carPrice and truckPrice.
        // Set the variables to any value you want.
        double carPrice = 20000.0;
        double truckPrice = 18000.0;
        double minPrice = Math.min(20000.0, 18000.0);
        System.out.println("The smallest price is " + minPrice);

        // Find and display the area of a circle whose radius is 7.25
        double area = Math.PI * Math.pow(7.25, 2);
        System.out.println("The area of the circle is " + area);

        // Find and display the square root the variable num1 after it is set to 5.0
        double sqrtNum1 = Math.sqrt(5.0);
        System.out.println("The square root of 5.0 is " + sqrtNum1);

        // Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        int xDifference = x2 - x1;
        int yDifference = y2 - y1;
        double distance = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
        System.out.println("The distance between the points is " + distance);

        // Find and display the absolute (positive) value of num2 after it is set to -3.8
        double absNum2 = Math.abs(-3.8);
        System.out.println("The absolute value of -3.8 is " + absNum2);

        // Find and display a random number between 0 and 99
        double randomNum = Math.random() * 100;
        System.out.println("A random number between 0 and 99 is " + randomNum);
    }
}









