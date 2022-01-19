package Day18_NestedLoop;

import java.util.Scanner;

public class First_Duplicated_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scan.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }
                }
            if (count >= 2) {
                System.out.print("" + str.charAt(i));
                break;
            }
        }scan.close();
    }
}
/*
Write a program that can return the first duplicated character from a string
 */