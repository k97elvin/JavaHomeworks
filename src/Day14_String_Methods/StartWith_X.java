package Day14_String_Methods;

import java.util.*;

public class StartWith_X {
    public static void main(String[] args) {
        System.out.println("enter a word:");
        String word = new Scanner(System.in).next();

        if (word.charAt(0) == 'x') {
            word.replaceFirst("x", "E");
        }
        System.out.println(word);

    }
}
