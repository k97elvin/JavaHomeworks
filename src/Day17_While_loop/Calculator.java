package Day17_While_loop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your num1:");
        int num1 =  scan.nextInt();

        System.out.println("Enter your num2:");
        int num2 =  scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0) ;

        while (!(operator=='*'||operator=='/')){
            System.out.println("Invalid operator re-enter.");
        }

        if (operator=='*'){
            System.out.println(num1*num2);
        }else System.out.println(num1 / num2);



    }
}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */