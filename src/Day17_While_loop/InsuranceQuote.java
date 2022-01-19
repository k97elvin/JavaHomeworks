package Day17_While_loop;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        System.out.println("Enter your name ");
        String name = scan.nextLine();


        System.out.println("Enter your gender");
        String gender = scan.next().toLowerCase();


        while (!(gender.equals("m") || gender.equals("f"))) {
            System.err.println("Invalid re-enter");
            gender = scan.next().toLowerCase();
        }
        System.out.println("Are you married?");
        String marriage = scan.next().toLowerCase();
        while (!(marriage.equals("yes") || marriage.equals("no"))) {
            System.err.println("Invalid please enter yes/no");
            marriage = scan.next().toLowerCase();
        }
        System.out.println("Enter your age");
        int age = scan.nextInt();
        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid number please re-enter");
            age = scan.nextInt();
        }
        System.out.println("How many miles do you drive a day?");
        int mile = scan.nextInt();
        while (mile < 50) {
            System.err.println("Invalid re enter");
            mile = scan.nextInt();
        }
        System.out.println("What kind of inshurance ? lib/full");
        String ins = scan.next();

        System.out.println("accidents in five years: yes/no");
        String accident = scan.next();

        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))) {
            System.err.println("invalid re enter:");
            accident = scan.next();
        }
        System.out.println("Do your car has an anti-theft device");
        String anti = scan.next();
        while (!(anti.equalsIgnoreCase("yes") || anti.equalsIgnoreCase("no"))) {
            System.out.println("invalid re enter");
            anti = scan.next();
        }

        if (ins.equalsIgnoreCase("lib")) {
            if (age < 25) {
                price = 90;
            } else if (age >= 25) {
                price = 50;
            }
            if (mile <= 10) {
                price += 10;
            } else if (mile > 10 && mile <= 50) {
                price += 30;
            } else if (mile > 50) {
                price += 50;
            }


        } else if (ins.equalsIgnoreCase("full")) {
            if (age < 25) {
                price = 160;
            } else if (age >= 25) {
                price = 120;
            }
            if (mile <= 10) {
                price += 20;
            } else if (mile > 10 && mile <= 50) {
                price += 40;
            } else if (mile > 400) {
                price += 70;
            }

        }

        if (anti.equalsIgnoreCase("yes")) {
            price = price - price / 20;
        }
        if (accident.equalsIgnoreCase("yes")) {
            price = price + price * 15 / 100;
        } else {
            price = price - price * 10 / 100;
        }
        if (marriage.equalsIgnoreCase("yes")) {
            price = price - price * 5 / 100;
        }
        System.out.println(price);
    }
}

    /*Create a class called InsuranceQuote, write a program that can calculate the
     insurance cost of a person based on the following info:
        1. Ask the user to enter your name
        2. Ask the user to enter your gender
        (if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        3. Ask the user if he/she is married(Yes/No)
        (if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        4. Ask user to enter your age
        (age can not be negative or greater than 120)
        (if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        5. Ask user to enter how many miles he/she drives in a day
        (mileage can not be negative or less than 5)
        (if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        6. Ask the user if he/she wants full coverage or liability insurance?

        7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
        (if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

        8. Ask the user if his/her car has an anti-theft device (Yes/No)
        (if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

        Calculate the price of the insurance and display all the info of the user*/

    /*    Insurance Quote calculation:
        starting prices for liability:
        age < 25 ===> 90
        age >= 25 ==> 50

        miles <= 10 ====> $10
        miles > 10 and miles <= 50 ==> $30
        miles > 50 ===>  $50

        starting prices for full coverage:
        age < 25 ===> 160
        age >= 25 ==> 120

        miles <= 10 ====> $20
        miles > 10 and miles <= 50 ==> $40
        miles > 50 ===>  $70


        If the car has anti-theft device ==> 5% discount
        If he/she had any accidents or claims in past 5 years ===> 15% extra charge
        If he/she never had any accidents or claims in past 5 years ==> 10% discount
        If he/she is married ==> 5% discount
*/