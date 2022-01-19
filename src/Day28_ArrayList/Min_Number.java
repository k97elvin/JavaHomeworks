package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Min_Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(Collections.min(list)); //1
        //_______________________OR_____________________________

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)<min){
                min= list.get(i);
            }
        }
        System.out.println(min);


    }
}
/*6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1

 */