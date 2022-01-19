package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap2 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(list,0,list.size()-1);
        System.out.println("list = " + list);
    }
}
