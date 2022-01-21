package DAY_16_ForLoop;

import java.util.Scanner;

public class Replace_All_X_with_A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word starts with \"X or x\"");

        String word = scan.next().toLowerCase();

        if (word.contains("x")||word.contains("X")){
            System.out.println(word.replaceAll("x","a"));
        }

    }


}
   /* Write a program that asks user to enter a word. and replace all
        the x or X with character a
        Input:
        xcodeX
        Output:
        acodea*/