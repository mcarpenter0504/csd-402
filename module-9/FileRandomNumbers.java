/* 
Name: Madilyn Carpenter
Date: 11/09/2025
Assignment 9
Purpose: Create or append to a file with 10 random numbers, then read and display the file’s contents.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileRandomNumbers {
    public static void main(String[] args) {
        
        String filename = "data.file";
        File file = new File(filename);
        Random rand = new Random();

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + filename);
            } else {
                System.out.println("File already exists, appending new numbers.");
            }

            // Write or append 10 random numbers
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100);
                writer.write(number + " ");
            }
            writer.close();

            // Read the file and display contents
            Scanner fileReader = new Scanner(file);
            System.out.println("Contents of " + filename + ":");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
}
