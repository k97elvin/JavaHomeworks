package DAY26_Custom_Methods_Overloading;

import utilities.ArraysUtility2;

public class FrequencyOfElements {
    public static void main(String[] args) {
     // 1.1 Create a method that passes two parameters: an integer array and an Integer element.
        // The method returns the frequency of the given integer element from the integer array

        int arr[] = {1,2,3,1,3,4,5,1};
        int element = 1;
        int res=ArraysUtility2.frequencyOfElement(arr,element);
        System.out.println(res);
        System.out.println("__________________________________");






    }
}
