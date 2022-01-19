package Day14_String_Methods;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String last3 = "";

        System.out.println("Enter your string: ");

        String word = scan.nextLine();

        int say = word.length();

        if (say == 0) {
            System.out.println("String is empty");

       /* String verilenSoz = scan.nextLine();

        int charaterSayi = verilenSoz.length();


       if (charaterSayi == 0) {
            System.out.println("empty");
        } else if (verilenSoz.length() > 3) {
            last3 = verilenSoz.substring(verilenSoz.length()-3);
            System.out.println(last3);

        } else{
            System.out.println(verilenSoz);

        }
        System.out.println("Enter word: ");
        String entered = scan.nextLine();
        int entLenght= entered.length();
*/
        }else if(say>3){
            System.out.println(word.substring(word.length()-3));

        }else{
            System.out.println(word);

        }
    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
