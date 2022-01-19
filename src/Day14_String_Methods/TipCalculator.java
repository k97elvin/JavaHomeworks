package Day14_String_Methods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      /*  System.out.println("Enter split checks?:");
        String split = scan.next();

        System.out.println("Enter number of people");
        int nrPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double check = scan.nextDouble();

        System.out.println("How was the service quality?:");
        String service = scan.next();

        double tip = (service.equals("Excellent"))? check*25/100
                : (service.equals("Great"))? check*20/100 :(service.equals("Good"))? check*15/100
                :(service.equals("Fair"))? check*10/100 :(service.equals("Poor"))? check*5/100 :0;

        double totalToPay = check + tip;
        double perPerson = totalToPay / nrPeople;
        double tipPerPerson = tip / nrPeople;


        if (split.equals("Yes")) {
            System.out.println(totalToPay);
            System.out.println(perPerson);
            System.out.println(tipPerPerson);
        }else {
            System.out.println("Total to Pay = " + totalToPay);
        }
        scan.close();
*/

        System.out.println("would yo like splite?");
        String split = scan.next();

        System.out.println("Enter number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter total amount:");
        double amount = scan.nextDouble();

        scan.nextLine();
        System.out.println("How was the srvice quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scan.nextLine();

        double tip = (service.equals("Excellent")) ? amount * 25 / 100 : (service.equals("Great")) ? amount * 20 / 100
                : (service.equals("Good")) ? amount*15/100 : (service.equals("Fair")) ? amount*10/100
                : amount*5/100;
        double total = amount+tip;
        double perPerson = total/numOfPeople;
        double perPersonTip = tip/numOfPeople;

        if (split.equalsIgnoreCase("yes")){
            System.out.println("number of people entered: " + numOfPeople +"\n Total payment: " +total +
                    "\ntotal tip: " + tip + "\nTip for per person: " + perPersonTip);
        }else {
            System.out.println("Total amount: " + total);
        }


    }
}
/*Create a class called TipCalculator, write a program for a tip calculator.
 There will be different service quality benchmarks that will determine the tip given.
  There will also the ability to calculate based on the
number of people in the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should display the following information based on the user input:

    Split or No split (Yes or No),  Number of people entered:
    (number) (each person = & in output) Check amount: (number) Service Quality:
    (String) Total to pay: Total tip: Total per person: Tip per person:

    Ex:
        Split or No split (Yes or No)?
        Yes
        Enter the number of people
        4
        Enter the check amount:
        476
        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
        Excellent

        output:
            Number of people entered: 4
            Total to pay: 595.0
            Total tip: 119.0
            Total per person: 148.75
            Tip per person: 29.75

    HINT: you will need to use .equals() method
 */