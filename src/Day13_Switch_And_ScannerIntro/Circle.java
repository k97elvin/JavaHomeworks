package Day13_Switch_And_ScannerIntro;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius number: ");
        double radius = input.nextDouble();
        double area = radius * 3.14 * radius;
        double perimeter=2*3.15*radius;
        System.out.println("area = " + area + "\nperimeter = " + perimeter );

    }
}
/*
 Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */