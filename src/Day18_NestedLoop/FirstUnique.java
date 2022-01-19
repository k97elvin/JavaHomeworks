package Day18_NestedLoop;

import java.util.Scanner;

public class FirstUnique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = scan.next();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch == ch2) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println("" + str.charAt(i));
                break;
            }
        }
        scan.close();
    }
}
/**
 * Write a program that can return the index number of the first unique character.
 */