package Day13_Switch_And_ScannerIntro;


import java.util.Scanner;

public class Scanner_Intro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer number: ");

        int num1 = input.nextInt();

        System.out.println("enter a decimal number: ");
        double dob1 = input.nextDouble();
    }
}
