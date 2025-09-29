/* 
Name: Madilyn Carpenter
Date: 9/29/2025
Assignment 3 - Pyramid Generator
Purpose: Generate a visual pyramid using numbers from multiplying 2
*/

public class PyramidGenerator {
    public static void main(String[] args) {
        int rows = 7;            
        int atColumn = 35;
        int firstPos = 16;

        for (int i = 1; i <= rows; i++) {
            StringBuilder row = new StringBuilder();

            // Ascending numbers
            int num = 1;
            for (int k = 1; k <= i; k++) {
                row.append(num);
                if (k != i) row.append(" ");
                num *= 2;
            }

            // Descending numbers
            num /= 4;
            for (int k = 1; k < i; k++) {
                row.append(" ").append(num);
                num /= 2;
            }

            // Compute leading spaces to position first number
            int rowLength = row.length();
            int leadingSpaces = firstPos - 1 - rowLength / 2;

            // Build final row with leading spaces
            StringBuilder finalRow = new StringBuilder();
            for (int s = 0; s < leadingSpaces; s++) {
                finalRow.append(" ");
            }
            finalRow.append(row);

            // Print row left-justified in width of 34, then @
            System.out.printf("%-" + (atColumn - 1) + "s@\n", finalRow.toString());
        }
    }
}
