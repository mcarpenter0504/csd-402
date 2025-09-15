/* 
Name: Madilyn Carpenter
Date: 9/14/2025
Assignment 1.2 - Programming Assignment
Purpose: calculate the energy needed to heat water from an initial temperature to a final temperature
*/

import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for water amount and temperatures
        System.out.print("Enter the amount of water in kilograms: ");
        double waterAmount = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        // Calculate energy
        double Q = waterAmount * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("The amount of Joules needed to heat the water to the desired temperature is " + Q + " J.");

        input.close();
    }
}

// Sources: https://stackoverflow.com/questions/15914676/how-to-get-input-via-command-line-in-java