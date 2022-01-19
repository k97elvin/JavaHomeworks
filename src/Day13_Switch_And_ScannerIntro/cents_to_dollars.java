package Day13_Switch_And_ScannerIntro;
import java.util.Scanner;
public class cents_to_dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of cents: ");

        int cents = scan.nextInt();
        int centsToDollar = cents/100;
        int remainder = cents%100;
        System.out.println(cents+ " cents equal to: " + centsToDollar +" dollars and " + remainder + " cents" );

    }
}
/*
Write a program that can convert cents to dollars, if there is any remainder include
them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */