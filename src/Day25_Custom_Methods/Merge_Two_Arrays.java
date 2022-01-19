package Day25_Custom_Methods;

import java.util.Arrays;

public class Merge_Two_Arrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6};
        System.out.println(Arrays.toString(merge_Two_Array(arr1, arr2)));

    }

    public static int[] merge_Two_Array(int arr1[], int arr2[]) {
        int merge[] = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            merge[i++] += each;
        }
        for (int each : arr2) {
            merge[i++] += each;
        }
        Arrays.sort(merge);
        return merge;
    }
}
