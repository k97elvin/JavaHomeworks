package Day14_String_Methods;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String AcNum = scan.next();

        int lengt = AcNum.length() ;

        if (AcNum.startsWith("2")&&lengt==7) {
            System.out.println("Account number is valid");
        }else if(AcNum.startsWith("5")&&AcNum.length()==10){
            System.out.println("Account number is valid");

        }else{
            System.out.println("invalid account number");
        }

    }
}

/*Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
If the account number begins with a “2” the account number should be 7 characters long
If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
                    
 */