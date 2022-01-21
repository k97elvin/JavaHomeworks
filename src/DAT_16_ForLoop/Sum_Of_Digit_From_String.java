package DAT_16_ForLoop;

import java.util.Scanner;

public class Sum_Of_Digit_From_String {
    public static void main(String[] args) {
     /*   Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        int sum = 0;


        for (int i=0; i<str.length();i++){

            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
               sum += str.charAt(i)-48;

            }
            System.out.print(sum);
scan.close();
        }
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                sum += str.charAt(i) - 48;
            }

        }
        System.out.println(sum);
        input.close();
    }
}
/*Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1*/