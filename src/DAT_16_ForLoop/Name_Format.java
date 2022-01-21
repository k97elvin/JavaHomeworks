package DAT_16_ForLoop;

import java.util.Scanner;

public class Name_Format {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter first name :");
        String first = scan.next();
      System.out.println("Enter last name:");
        String last = scan.next();

        System.out.print(first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase() + " ");
        System.out.println(last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase());


    }
}
/*
3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
complete switch statements short quiz due by 11:35 am
Tasks:
 */