package Day14_String_Methods;

import java.util.Scanner;

public class CheckWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = scan.next();

        System.out.println("Enter second word:");
        String word2 = scan.next();

        System.out.println("Entre third word:");
        String word3 = scan.next();
     /*   int l1 = word1.length();
        int l2 = word2.length();
        int l3 = word3.length();*/
        if (word1.length() == word2.length() && word1.length() == word3.length()) {
            System.out.println("All words are same");
        } else if (word1.length() != word2.length() && word1.length() != word3.length()&&
                word2.length() != word3.length()) {
            System.out.println("All different");

        } else {
            System.out.println("Not Same or Different lengths");
        }
    }
}
/*Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */