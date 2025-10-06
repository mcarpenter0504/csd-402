/* 
Name: Madilyn Carpenter
Date: 10/05/2025
Assignment 4 - Average Calculator
Purpose: Calculate the average of various arrays.
*/

import java.util.Arrays;

public class AverageCalculator {

    // Calculate average of short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    // Calculate average of int array
    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int)(sum / array.length);
    }

    // Calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4};
        int[] intArray = {10, 20, 30, 40, 50};
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.println("Short Array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println("Int Array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println("Long Array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}
