package Day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(Arrays.asList(list));

        for (int i = list.size()-1; i>=0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(Arrays.asList(list2));

    }
}
