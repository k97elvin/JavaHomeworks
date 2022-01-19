package Day18_NestedLoop;

import java.util.Scanner;

public class Highest_Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1 == ch2) {
                    frequency++;

                }
            }
        }scan.close();
    }
}
/**
 *  Write a program that can find the character that has the highest frequency from a string
 */