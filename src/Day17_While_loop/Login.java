package Day17_While_loop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login:");
        String log = scan.next();

        System.out.println("Enter your password:");
        String pass = scan.next();

        if (log.equals("Cydeo") && pass.equals("Cydeo123")) {
            System.out.println("logged in.");

        } else {
            int chance = 3;

            while (!(log.equals("Cydeo") && pass.equals("Cydeo123"))) {

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your user name:");
                log = scan.next();

                System.out.println("Enter your password:");
                chance--;
            }
            if (log.equals("Cydeo")&& pass.equals("Cydeo123")){
                System.out.println("Logged in");

            }else {
                System.out.println("Your account is locked.");
            }
        }

    }
}
/**
 * you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
 * username: Cydeo
 * password: Cydeo123
 * <p>
 * Ask the user to enter their credentials.
 * If credentials are matched, your program should print "Logged in."
 * If the credentials are not matched, the program should allow the user to have three attempts to enter
 * correct credentials and if all three attempts are failed, then print "Your account is lucked.
 */