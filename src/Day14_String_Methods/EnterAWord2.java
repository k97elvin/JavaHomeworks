package Day14_String_Methods;

import java.util.Scanner;

public class EnterAWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word:");
        String word = scan.next();

       char result = word.charAt(0) ;
        if (word.charAt(0)>=48&&word.charAt(0)<=57){
            System.out.println("First character is digit");
        } else if (word.charAt(0)>=65&&word.charAt(0)<=90){
            System.out.println("first character is uppercase letter");

        } else if(word.charAt(0)>=97&&word.charAt(0)<=122){
            System.out.println("first character is lowercase letter");
        }else{
            System.out.println("first character is special character");

        }


    }
}
/*5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table

 */