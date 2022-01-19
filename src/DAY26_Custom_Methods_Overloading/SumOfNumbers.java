package DAY26_Custom_Methods_Overloading;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        int r = sumOfNumbers(3, 5, 7);
        System.out.println(r);
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        int r = num1 + num2 + num3;
        return r;
    }
}
