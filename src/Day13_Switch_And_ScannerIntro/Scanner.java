package Day13_Switch_And_ScannerIntro;

import java.util.Scanner;
//import java.util.*

class ScannerPracticeCircle {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the radius of the sircle: ");

        double r = scan.nextDouble ();
        double area = r*r*3.14;
        double perimeter = 2*r*3.14;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        scan.close();

    }
    }



