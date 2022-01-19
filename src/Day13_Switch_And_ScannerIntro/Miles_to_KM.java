package Day13_Switch_And_ScannerIntro;
import java.util.Scanner;
public class Miles_to_KM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter miles: ");
        double miles = scan.nextDouble();
        double km = miles*1.609;
        System.out.println(miles + "miles equal to " + km);
    }
}
/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */