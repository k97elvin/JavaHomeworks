package Day22_Arrays;

import java.util.Arrays;

public class HundreedToOne {
    public static void main(String[] args) {
        int []numbers = new int[100];

      for(int  i = 0;i< numbers.length;i++){

          numbers[i]= numbers.length-i ;

      }
        System.out.println(Arrays.toString(numbers));
    }
}
/*    create an array that has the numbers 100 to 1*/