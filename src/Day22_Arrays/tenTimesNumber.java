package Day22_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class tenTimesNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.nextLine(); // It is not array?  //info@cybertekschool.com


        ; // [info]   [cybertekschool.com]
        // array has 2 indexes in this case        0              1

        int count = 0;  // if more than 1 @@ or less than 1 is there then "Invalid email"

        for (int i = 0; i < email.length(); i++) {


            String[] emailSplit = email.split("@");
            if (email.contains("@")) { // eger @ isaresi varsa say
                count++;
            }

            while (!(count == 1)) {
                System.out.println("Invalid entry");
                break;
            }
            if (count == 1) {
                System.out.println("UserId:" + emailSplit[0]);  // info
                System.out.println("Domain is: " + emailSplit[1]);// cybertekschool.com
            }


        }
    }


}
//elvin@@gmail.com