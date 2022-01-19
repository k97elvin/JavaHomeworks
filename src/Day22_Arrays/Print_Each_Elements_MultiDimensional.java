package Day22_Arrays;

import java.util.Arrays;

public class Print_Each_Elements_MultiDimensional {
    public static void main(String[] args) {
        int[][][][][][][][] arr8D = {{{{{{{{1, 2, 3, 4, 5}}}}}}}};

        for (int[][][][][][][] each7 : arr8D) {
            for (int[][][][][][] each6 : each7) {
                for (int[][][][][] each5 : each6) {
                    for (int[][][][] each4 : each5) {
                        for (int[][][] each3 : each4) {
                            for (int[][] each2 : each3) {
                                for (int[] each1 : each2) {
                                    for (int eachNUmber : each1) {
                                        System.out.print(eachNUmber + " ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
/*3. Given the array:
            int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };


        Use for each loop to print each element

 */