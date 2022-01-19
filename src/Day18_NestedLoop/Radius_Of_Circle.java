package Day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class Radius_Of_Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter radius:");

            int rad = scan.nextInt();

            while (!(rad > 0)) {
                System.err.println("Invalid entry re enter:");
                rad = scan.nextInt();
            }
            if (rad > 0) {
                int diameter = 2 * rad;
                double per = 2 * 3.14 * rad;
                double area = 3.14 * rad * rad;
                System.out.println("diametr: " + diameter + "\n" + "perimeter: " + per + "\nradius: " + rad);
            }
            System.out.println();
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid re enter:");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
            }
            break;

        } scan.close();
    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task

 */