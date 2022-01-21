package DAT_16_ForLoop;

import java.util.Scanner;

public class Replace_X_with_A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s1 = scan.next().toLowerCase();

        if (s1.startsWith("x")){
            System.out.println (s1.replace("x","a"));
        }
    }

}
/*
Write a program that asks user to enter a word. If the word
starts with x, replace it with a.
Input:
xcodex
Output:
acodex
 */