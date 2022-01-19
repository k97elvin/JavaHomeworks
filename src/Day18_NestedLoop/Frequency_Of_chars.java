package Day18_NestedLoop;

import java.util.Scanner;

public class Frequency_Of_chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.next();
        System.out.println("Enter your char:");
        char ch = scan.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if (ch==each){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}
