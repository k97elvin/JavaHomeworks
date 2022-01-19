package Day14_String_Methods;

/*import java.util.Scanner;

public class TravelEx {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You have valid passport");
        String passport = scan.next();
        if (passport.equals("yes")) {
            System.out.println("Country you want travel to");
            scan.nextLine();
            String country = scan.nextLine();
            System.out.println("How many bags you have");
            byte bags = scan.nextByte();
            System.out.println("How many people you travel with");
            short people = scan.nextShort();
            scan.nextLine();
            System.out.println("Enter the name of the people you travel with in one line");
            String peopleName = scan.nextLine();

            int costOfTicket = 1000;
            int discount = people * 100;
            int max = 300;
            if (discount <= max) {
                discount = people * 100;
            } else
                discount = max;


            if (passport.equals("yes")) {
                System.out.println("Your ticket is booked to " + country + ". We have charged extra " + (bags * 50) + "\n" +
                        " for the " + bags + " bags, but you are traveling with " + people + " person so we are giving a \n " +
                        "discount " + discount + " Your total cost is " + (costOfTicket + (bags * 50) - discount));
            } else if (passport.equals("no")) {
                System.out.println("455");
            }

        }
}


*/

import java.util.Scanner;

class TravelEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan=new Scanner(System.in);

        System.out.println("Do you have valid passport?");
        String passport=scan.next();

        scan.nextLine();
        System.out.println("Where is your destination?");
        String country=scan.nextLine();

        System.out.println("How many bags do you take with you?");
        byte bag= scan.nextByte();;

        System.out.println("How many people travel with you?");
        short numPeople=scan.nextShort();

        int cost=1000*numPeople;

        int extra=50*bag;
        cost+=50*bag;

        if(numPeople>=3){
            cost-=300;
        }else{
            cost-=numPeople*100;
        }
        if(passport.equalsIgnoreCase("yes")){
            System.out.println("Your ticket is booked to "+country+" We have charged extra "+bag+" $"+
                    extra+" but you are travelling with "+numPeople+" so we are giving a discount Your total cost is $"+cost);
        }else{
            System.out.println("when your passport expired?");
            int numberOfYear= scan.nextInt();
            cost+=200;
            cost+=75*(2021-numberOfYear);
            scan.nextLine();
            System.out.println("Which country would you like to travel?");
            String country2= scan.nextLine();
            System.out.println("Are you going to travel next year?");
            String answer=scan.next();
            if(answer.equalsIgnoreCase("yes")) {
                cost = +100;
            }else {
                cost=-50;
            }
            System.out.println("Looks like your password has been expired for "+numberOfYear+" years, but no worry we will get it ready for you to travel to"+country2+ " your total cost has come to "+cost);
        }


    }
}

