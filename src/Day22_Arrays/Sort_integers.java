package Day22_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Sort_integers {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 4, 8};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            int reverse = arr[i];
            System.out.println(reverse);

        }
    }
}

