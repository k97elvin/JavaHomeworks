package Day22_Arrays;

import java.util.Arrays;

public class Move_Zeros_End {
    public static void main(String[] args) {
int []array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);
        int reverse = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse=array[i];
            System.out.println(reverse);
        }

        }
    }

/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */