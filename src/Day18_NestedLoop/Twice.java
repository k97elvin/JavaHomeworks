package Day18_NestedLoop;

import java.util.Scanner;

public class Twice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();
        int count = 0;
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch2 = word.charAt(j);
                if (ch == ch2) {
                    count++;
                }
            }
            if (result.contains(""+ word.charAt(i))){
                continue;
            }else if (count==2){
                result+=""+word.charAt(i);
            }
        }
        System.out.println(result);
        scan.close();
    }

}
/*
 3. Write a program that can display all the characters that appeared twice in the string.
 */