/* 
Name: Madilyn Carpenter
Date: 11/16/2025
Assignment 10
Purpose: Runs the program by creating objects of both division types and displaying their details.
*/

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intDiv1 =
                new InternationalDivision("Germany International", 01, "Germany", "German");

        InternationalDivision intDiv2 =
                new InternationalDivision("France International", 02, "France", "French");

        DomesticDivision domDiv1 =
                new DomesticDivision("MO Mid-West", 03, "Missouri");

        DomesticDivision domDiv2 =
                new DomesticDivision("KS Mid-West", 04, "Kansas");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
