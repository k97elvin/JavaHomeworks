package Day14_String_Methods;

import java.util.Scanner;

public class StartWithx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");
        String word = scan.next();

        if (word.indexOf("x")==0){
            System.out.println(word.substring(1));
        }

    }
}
  /*  Ask user to enter a word. If the work starts with x, print the word without x.
        Input:
        xcode
        Output:
        code*/