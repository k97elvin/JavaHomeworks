package DAT_16_ForLoop;

import java.util.Scanner;

public class Factorial_Num {
    public static void main(String[] args) {

        System.out.println("Enter your factorial number:");
        Scanner scan= new Scanner(System.in);
        int factorialNum = 1;
        int num = scan.nextInt();


        for ( int i = num; i>=1; i--) {
        factorialNum *=i;
        }
        System.out.println(factorialNum);
    }
}
  /*  Write a program that can return the factorial number of any given
        number
        Ex:
        input: 5
        output: 120
        ( because: 5! = 5 * 4 * 3 * 2* 1 * = 120 )




   */