package Day21_Each_Loop;

import java.util.Scanner;

public class loop_practice {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);

        System.out.println("Enter num");
        int num = scan.nextInt();
        int min = 10;
        for (int i = 10; i >= 0; i--) {

            if (num < min) {
                min = num;
            }

        }
        System.out.println("min" + min);
        scan.close();*/


        System.out.println("__________________________________");

/*
        String word = "Salam";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
            System.out.println("_________________________");*/

           /* String str = "aabbcc";
            String res = "";

            for (int i = 0; i < str.length(); i++) {
                String ch = "" + str.charAt(i);

                if (!res.contains(ch)) {
                    res += ch;
                }
            }
            System.out.println(res);*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            String ch = "" + word.charAt(i);
            if (!res.contains(ch)) {
                res += ch;
            }

        }System.out.println(res);


    }
}
