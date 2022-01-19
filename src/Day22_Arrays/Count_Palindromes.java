package Day22_Arrays;

import java.util.Arrays;

public class Count_Palindromes {
    public static void main(String[] args) {
        String[] words = {"anna", "level", "Java"};

        int palindromes = 0;

        for (String each : words) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
                if (each.equals(reverse)) {
                    palindromes++;
                }

            }
        }
        System.out.println(palindromes);
    }
}
/* 4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */