package Day17_While_loop;

import java.util.Scanner;

public class calculator_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int num;
        int result = 0;
        do{
            System.out.println("Enter a number");
            num = scan.nextInt();
            result +=num;
        }
        while (num > 0);
        System.out.println(result-num);
    }
}
/*

	2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */