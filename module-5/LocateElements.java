/* 
Name: Madilyn Carpenter
Date: 10/12/2025
Assignment 5 - Locate elements in a 2 dimensonal array and print coordinates.
Purpose: 
*/

public class LocateElements {

    // Methods for double
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Methods for int
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        double[][] doubleArray = {
            {5.5, 10.5, 15.5},
            {4.1, 8.1, 12.1},
            {3.15, 6.15, 9.15}
        };

        int[][] intArray = {
            {1, 4, 6},
            {7, 2, 5},
            {9, 8, 3}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest Double Coordinates - (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest Double Coordinates - (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
        System.out.println("Largest Int Coordinates - (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest Int Coordinates - (" + smallestInt[0] + ", " + smallestInt[1] + ")");
    }
}
