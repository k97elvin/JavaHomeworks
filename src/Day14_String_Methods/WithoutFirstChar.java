package Day14_String_Methods;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord=scan.next();

        System.out.println("enter second word");
        String secondWord = scan.next();

        System.out.println(firstWord.substring(1)+secondWord.substring(1));
    }
}
/*. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */