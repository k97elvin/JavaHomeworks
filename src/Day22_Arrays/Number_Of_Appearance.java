package Day22_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Number_Of_Appearance {
    public static void main(String[] args) {

        String sentence = "I learn java, not javascript. Python is interesting, not as java.";
        String[] arraySentence =
                sentence.replace(",", "").replace(".", "").split(" ");
        int count_Java = 0;
        int count_Python = 0;

        for (String each :arraySentence) {
           if (each.equals("java")){
               count_Java++;
           }
            if (each.equals("python")){
                count_Python++;
            }
        }
        System.out.println("count_Python = " + count_Python);
        System.out.println("count_Java = " + count_Java);

        }
    }
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in replit, but this time you MUST use arrays and for each loop)


 */