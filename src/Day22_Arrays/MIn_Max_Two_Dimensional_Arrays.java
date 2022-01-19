package Day22_Arrays;

import java.util.Arrays;

public class MIn_Max_Two_Dimensional_Arrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 5, 3, 9}, {6, 8, 3, 2}};
        int max = 0;
        int min = 1000000;
        for (int oneDimens[] : numbers) {
            for (int mergeArrays : oneDimens) {
                if (mergeArrays>max){
                    max=mergeArrays;
                }
                if (mergeArrays<min){
                    min=mergeArrays;
                }
            }

        }
        System.out.println("max= " + max);
        System.out.println("min = " + min);
    }
}
/*
1. Write a program that can find the minimum and maximum numbers from a two-dimensional array
 */