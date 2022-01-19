package Day14_String_Methods;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address:");
        String email = scan.next();

        String first = "";                        ///           elvin_karimli
        String last = "";
        String domain = "";

        if (email.contains("_")){
            first = email.substring(0, email.indexOf("_"));
            last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            domain= email.substring(email.indexOf("@"));

           first = first.substring(0,1).toUpperCase() + first.substring(1);
           last = last.substring(0,1).toUpperCase() + last.substring(1);
            System.out.println(first + "\n" + last + "\n" + domain);
        }else {
            System.out.println("invalid");
        }

        System.out.println("First name: "+ first + "\n" + "Last name: "+last + "\n" + "Domain: "+domain);
    }
}
   /* Create a class called EmailTask2.
        Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that will print out information about user based on email. Print first name, last name,
    and domain.

        First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

        Ex:
        input:
        craig_federighi@apple.com

                Output:
                        First name: Craig
                        Last name: Federighi
                        Domain: apple

    */