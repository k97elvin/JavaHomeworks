package DAY26_Custom_Methods_Overloading;

import utilities.ArraysUtility2;

import java.util.Arrays;

public class ReplaceThreeElements {
    public static void main(String[] args) {
        /*1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}*/

        int []arr = {1,2,3,4,5};
        int[]res=ArraysUtility2.replace(arr,2,30);
        System.out.println(Arrays.toString(res));
    }
}
