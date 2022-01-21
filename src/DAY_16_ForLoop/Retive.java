package DAY_16_ForLoop;

import java.util.Scanner;

public class Retive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String digits = "";
        String letters = "";
        String specialChars = "";

        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 0 && ch <= 9) {
                digits += ch;

            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch < 'z')) {

                letters += ch;
            } else {
                if (ch != ' ') {
                    specialChars += ch;
                }
            }

        }


        System.out.println(specialChars);
    }






}
/*
write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */