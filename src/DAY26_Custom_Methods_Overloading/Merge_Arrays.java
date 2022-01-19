package DAY26_Custom_Methods_Overloading;

import java.util.Arrays;

public class Merge_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merge = mergeArrays(arr1, arr2);
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
        System.out.println("_________________________________________");

        double arr4[] = {3, 4, 5};
        double arr5[] = {6, 7, 8, 9};

        double[] merge2 = mergeArrays(arr4, arr5);
        System.out.println(Arrays.toString(merge2));
        System.out.println("_________________________________________");


    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int mergedArr[] = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            mergedArr[i++] = each;
        }
        for (int each : arr2) {
            mergedArr[i++] = each;
        }
        return mergedArr;


    }

    public static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] mergedArr = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1) {
            mergedArr[i++] = each;
        }
        for (double each : arr2) {
            mergedArr[i++] = each;
        }

        return mergedArr;

    }

    public static char[] mergeArr(char arr1[], char[] arr2) {

        char[] mergedArr = new char[arr1.length + arr2.length];
        int i = 0;

        for (char each : arr1) {
            mergedArr[i++] = each;

        }
        for (char each : arr2) {
            mergedArr[i++] = each;
        }
        return mergedArr;

    }

    public static String[] mergedArr(String arr1[], String arr2[]) {
        String mergedArr[] = new String[arr1.length + arr2.length];
        int i = 0;

        for (String each : arr1) {
            mergedArr[i++] = each;

        }

        for (String each : arr2) {
            mergedArr[i++] = each;

        }

        return mergedArr;
    }


}
