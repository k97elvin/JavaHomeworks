package DAY26_Custom_Methods_Overloading;

import java.util.Arrays;

import utilities.ArraysUtility2;
import utilities.MathUtility2;

public class MergeTwoIntegerArrays {
    public static void main(String[] args) {
        //  1. create a method that can merge two integer arrays.
        //  merger(int[] arr1, int[] arr2)
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {7, 8, 9, 10, 11, 12};
        int[] r = ArraysUtility2.merge(a, b);
        System.out.println(Arrays.toString(r));


        System.out.println("-----------------------------");


// 1. create a method that can return the max number from an integer array
        int num1 = 10, num2 = 20;
        int res = MathUtility2.maxNumber(num1, num2);
        System.out.println(res);

        System.out.println("-----------------------------");

        //create a method that can return the min number from an integer array
        int num3 = 8, num4 = 40;
        int res2 = MathUtility2.minNumber(num3, num4);
        System.out.println(res2);

        System.out.println("-----------------------------");
        // Create a method that can reverse an integer array

        int arr1[]={1,2,3,4,5};
      int r3[]=  ArraysUtility2.reverse(arr1);
        System.out.println(Arrays.toString(r3));
        System.out.println("-----------------------------");
    }
}
