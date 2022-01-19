package Day14_String_Methods;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scan.nextLine();

        String firstName = "";
        String lastName = "";
        String domain = "";
        if (email.contains("_")) {
            firstName = email.substring(0, email.indexOf("_"));    /** elvin_kerimli@gmail.com  */
            lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));
            System.out.println(lastName + "_" + firstName + domain);

        } else {
            System.out.println(email);



        }

        scan.close();
    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */