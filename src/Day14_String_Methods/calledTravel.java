package Day14_String_Methods;

import java.util.Scanner;
/*
public class calledTravel {
    public static void main(String[] args) {
    /*    Scanner scan = new Scanner(System.in);

        System.out.println("Do you have valid passport? ");
        String passport = scan.next();
        (passport.equalsIgnoreCase("yes")) ?


                System.out.println("Country you want to travel: ");
        String country = scan.nextLine();

        System.out.println("how many bags do you have ?");
        byte bags = scan.nextByte();

        System.out.println("How many people you will travel with?");
        short numOfPeople = scan.nextShort();

        System.out.println("Enter the name of people you will travel with:");
        String nameOfPeople = scan.nextLine();

        int cost = numOfPeople * 1000;
        int bagCost = bags * 50;

        int extraBag = bags * 50;
        cost = cost + bagCost;

        if (numOfPeople >= 3) {
            cost -= 300;
        } else {
            cost -= numOfPeople * 100;
        }
        if(passport.equalsIgnoreCase("yes")){
            System.out.println("your ticket booked to " + country + "We've charged extra " + extraBag +
                    +"$" + extraBag);
        }


    }
}
/*Create a class calledTravel. Make a cost variable to calculate how much the person will
owe after everything.
        Ask the user if they have a valid passport (yes or no)
            If the user enters yes:
                    The base cost of the ticket should be set to: 1000
                    Ask the user the country they to travel to (String, multiple word)
                    Ask the user how many bags they will take with them (byte)
Each bag will add 50 to the cost
                    Ask the user how many people they will travel with (short)
For each person the cost is reduced by 100. Up to a limit of 300.
        Ask the user to Enter the name of the people they will travel with in one line,
         separating each name with a comma (String, multiple word)

                    Print: "Your ticket is booked to $countryName.
       We have charged extra for the $numberOfBags bags but
       you are traveling with $peopleYouTravelWith so we are giving a discount.
        Your total cost is $costAmount"


            If the user enters no:
                    The base cost of the passport renewal is: 200
                    Ask the user when their passport expired(int)
Each year it was expired adds 75 to the cost
                    Ask the user which country they plan to travel
                    Ask the user if they will be traveling in the next year (String - yes or no)
If yes: add 100 to the cost
If no: subtract 50 from the cost

                    Print: Looks like your password has been expired for $years,
                    but not to worry we will get it ready for you to travel to $allCountries.
                    Your total cost has come out to $costAmount.

 */