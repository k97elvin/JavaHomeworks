package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Move_All_Zeros {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0, 1, 3, 0, 7, 8, 0, 6));

        list.removeIf(n -> (n == 0));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.add(0);

        }
        System.out.println(list);

    }
}
/*2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]

 */