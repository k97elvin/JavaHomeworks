package Day13_Switch_And_ScannerIntro;

import java.util.Scanner;

public class people_they_live {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people: ");
        int people = scan.nextInt();
        if (people > 0) {
            if (people < 3) {
                System.out.println("Live less than 3 people");
            } else if (people >= 3 && people <= 6) {
                System.out.println("Live with 3 - 6 people");

            } else {
                System.out.println("Live with more than 6 people");
            }

        } else {
            System.out.println("invalid number");
        }
    }
}
/*Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


 */