package DAY26_Custom_Methods_Overloading;

import utilities.ArraysUtility2;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
    /*    2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
        Ex:
        int[] arr = {10,20,30,40}
        remove(arr, 2) ==> {10, 20, 40}*/
        int[] arr = {10, 20, 30, 40};

        int[] res = ArraysUtility2.removeElement(arr, 2);
        System.out.println(Arrays.toString(res));

    }
}
