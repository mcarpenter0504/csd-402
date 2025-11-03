/* 
Name: Madilyn Carpenter
Date: 11/02/2025
Assignment 8
Purpose: Take integer array list and display largest number in list.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MadilynArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);
        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers. To stop enter 0: ");

        while (true) {
            Integer value = input.nextInt();
            numbers.add(value);
            if (value == 0) {
                break;
            }
        }

        Integer largestValue = max(numbers);
        System.out.println("The largest value is: " + largestValue);

        // More tests
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(1);
        test1.add(5);
        test1.add(2);
        test1.add(0);
        System.out.println("Test 1: " + max(test1));

        ArrayList<Integer> test2 = new ArrayList<>();
        System.out.println("Test 2: " + max(test2));

        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(-5);
        test3.add(-10);
        test3.add(-15);
        System.out.println("Test 3: " + max(test3));

        ArrayList<Integer> test4 = new ArrayList<>();
        test4.add(92);
        System.out.println("Test 4: " + max(test4));

        input.close();
    }
}
