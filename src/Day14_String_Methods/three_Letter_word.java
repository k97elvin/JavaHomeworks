package Day14_String_Methods;

import java.util.*;

public class three_Letter_word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");

        String word = scan.next();

        System.out.println();

        if ( word.length() ==3 && word.charAt(1) == 'a') {
            System.out.println("cool word");

        } else if (word.length() ==3 && word.charAt(1) != 'a') {
            System.out.println("okay word");
        } else if (word.length() < 3) {
            System.out.println("Word is too short");
        } else {
            System.out.println("Word is too long");
        }
    }
}
/*
4. write a program that asks the user enter a three letter word.
 1)Check if the middle character of the given word is 'a'. In the case it is print: "Cool word",
  but in the case the middle letter is not 'a' print: "Okay word".
     -

     If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */