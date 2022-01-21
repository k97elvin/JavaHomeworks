package DAY_16_ForLoop;

import java.util.Scanner;

public class Sum_Scan_Version {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number:");
        int firstNumber = scan.nextInt();

        int sum=0;
        System.out.println("Enter your second number:");
        int secondNumber = scan.nextInt();
        for (int i = firstNumber; i <= secondNumber;i++ ){

            sum+=i;
        }

        System.out.println(sum);
    }
}
/*
write a program that can calculate the sum of all numbers between
1 to any given number
 */