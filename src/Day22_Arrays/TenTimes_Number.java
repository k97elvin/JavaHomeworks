package Day22_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TenTimes_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number ten times ");
            int num = scan.nextInt();
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
        int min = numbers[0];
        System.out.println("Max number is: " + max + "\n" +"Min number is: "+ min);
        scan.close();
    }
}
/*
 3. Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
 */