package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maximum_Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println( Collections.max(list));

//____________________or_______________________________________


        int max = Integer.MIN_VALUE;
        for (Integer each:list){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
    }
}
/*5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5

 */