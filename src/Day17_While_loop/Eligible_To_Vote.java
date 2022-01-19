package Day17_While_loop;

import java.util.Locale;
import java.util.Scanner;

public class Eligible_To_Vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scan.nextInt();

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid age re enter");
            age = scan.nextInt();
        }
        System.out.println("Are you US citizen?");
        String answer = scan.next().toLowerCase();
        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid ");
            answer = scan.next().toLowerCase();

        }
        if ((age >= 18 && answer.equals("yes"))){
            System.out.println("You are eligible");
        } else {
            System.err.println("You are not eligible");
        }
    }
}
