package DAY26_Custom_Methods_Overloading;

import java.util.Arrays;

public class OverloadMinNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int res = minimumNumber(arr);
        System.out.println((res));
    }

    public static int minimumNumber(int[] arr) {
        int i = 2000;
        int min = 0;
        for (int each : arr) {

            if (each < i) {
                min = each;
            }
        }
        return min;


    }

}
/*Task 5:
    1. create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array

 */