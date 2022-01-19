package Day23_MultiDimensional_Arrays;

import java.util.Arrays;

public class Reverse_TwoDimensional_Array {
    public static void main(String[] args) {
        int[][] array2d = {{1, 2, 3}, {4, 5, 6}};

        for (int i = array2d.length - 1; i >= 0; i--) {
            for (int j = array2d[i].length - 1; j >= 0; j--) {
                System.out.print(array2d[i][j] + " ");
            }
        }
    }
}

  
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};
			output:
                   reverse = { {6,5,4}, {3,2,1},};
 */