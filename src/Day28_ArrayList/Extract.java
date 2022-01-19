package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Extract {
    public static void main(String[] args) {
       String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        //   list.removeIf(n->Character.isDigit());

        ArrayList<Character> nums = new ArrayList<>(list);
        nums.removeIf(each-> !Character.isDigit(each));

        ArrayList<Character> letters = new ArrayList<>(list);
        letters.removeIf(each-> !Character.isLetter(each));

        ArrayList<Character> special = new ArrayList<>(list);
        special.removeIf(each-> Character.isLetterOrDigit(each));

        System.out.println("special = " + special);
        System.out.println("letters = " + letters);
        System.out.println("nums = " + nums);





    }
}
/*3. Write a program that can extract the special characters, digits and letters from a string and stores them
 into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}

 */