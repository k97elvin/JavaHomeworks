package Day22_Arrays;

import java.util.Arrays;

public class Arrays_Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int[] arr3 = new int[arr1.length + arr2.length];

   /*     for (int i = 0; i < arr1.length; i++) {
            arr3[arr1.length + arr2.length] += arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + arr2.length] += arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
*/
        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each:arr2){
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
/*
    String[] group1 = {"Ali", "Layan", "Aysenur"}; // 3
    String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

    String[] students = new String[group1.length + group2.length];  // 8

    int i = 0;
        for(String each:group1){ // Ali, Layan, Aysenur
                students[i++]=each;
                }


                for(String each:group2){
                students[i++]=each;
                }

                System.out.println(Arrays.toString(students));
*/
/*
 — 12/06/2021
1. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */