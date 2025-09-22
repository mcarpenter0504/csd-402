/* 
Name: Madilyn Carpenter
Date: 9/22/2025
Assignment 2 - Rock, Paper, Scissors.
Purpose: Simulate a rock, paper, scissors game between user and computer
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Random number for computer player
        int computerChoice = random.nextInt(3) + 1;

        // User input
        System.out.println("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
        int userChoice = input.nextInt();

        // Convert number to string
        String computerPick = numberToName(computerChoice);
        String userPick = numberToName(userChoice);

        // Show choices
        System.out.println("You chose: " + userPick);
        System.out.println("Computer chose: " + computerPick);

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win :)");
        } else {
            System.out.println("Result: Computer wins :(");
        }

        input.close();
    }

    // Converts number to Rock, Paper, or Scissors
    public static String numberToName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }
}
