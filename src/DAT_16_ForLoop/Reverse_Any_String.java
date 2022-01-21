package DAT_16_ForLoop;

import java.util.Scanner;

public class Reverse_Any_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your word:");
    String word = scan.nextLine();
    String result = "";
    for(int i = word.length()-1;i>=0;i-- ){
        result+= word.charAt(i);

    }
        System.out.println(result);

    }
}
 /*   Write a program that can reverse any given string
        Ex:
        input:
        Wooden Spoon
        output:
        noopS nedoo*/