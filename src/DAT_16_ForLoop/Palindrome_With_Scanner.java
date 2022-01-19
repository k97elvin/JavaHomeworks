package DAT_16_ForLoop;

import java.util.Scanner;

public class Palindrome_With_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word to check it for palindrome: ");
        String word = scan.next();
        String palindrome = "";

        for(int i = word.length()-1;i>=0;i--){
            palindrome+=word.charAt(i);
        }
        boolean result = word.equalsIgnoreCase(palindrome);
        System.out.println("palindrome: "+result);
    }
}
