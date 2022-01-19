package Day18_NestedLoop;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();

            while (!(side > 0)) {
                System.out.println("Invalid Entry for the side of the square");
                side = scan.nextInt();
            }
            if (side >= 1) {
                int area = side * side;
                int perimeter = side * 4;
                System.out.println("area: " + area + "\nPer: " + perimeter);
            }
            scan.nextLine();
            System.out.println("Would you like to calculate another Square?");
            String answer = scan.nextLine();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
break;
            }

        }scan.close();
    }
}
/*
2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers,
				terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
 */