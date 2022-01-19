package Day22_Arrays;

public class Reverse_Arrays_integers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int reverse = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            reverse = array[i];
            System.out.println(reverse);
        }
    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */