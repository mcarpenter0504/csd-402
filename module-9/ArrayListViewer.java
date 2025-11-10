/* 
Name: Madilyn Carpenter
Date: 11/09/2025
Assignment 9
Purpose: Store strings in an ArrayList, displays them, and let the user select an element to view while handling invalid inputs with exceptions.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListViewer {
    public static void main(String[] args) {
        
        // Create an ArrayList with 10 Strings
        ArrayList<String> options = new ArrayList<>();
        options.add("Wolfhound");
        options.add("Cheetah");
        options.add("Humming Bird");
        options.add("Cow");
        options.add("Pig");
        options.add("Salmon");
        options.add("Lion");
        options.add("Bear");
        options.add("Crow");
        options.add("Tuna");

        // Print all elements using a for-each loop
        System.out.println("ArrayList contents:");
        for (String option : options) {
            System.out.println(option);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which item would you like to see (0-9)? ");
        
        try {
            int index = Integer.parseInt(scanner.nextLine());
            Integer boxedIndex = index;
            System.out.println("Selected item: " + options.get(boxedIndex));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}
