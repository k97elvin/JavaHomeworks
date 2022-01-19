package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Multiply_Each_Odd_Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.set((i), list.get(i) * 2);
            }
        }

        System.out.println(list);


        // or
        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer each : list) {
            if (each % 2 != 0) {
                each = each * 2;
            }
            list2.add(each);
        }
        System.out.println(list2);

    }

}
/*2.3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]


 */