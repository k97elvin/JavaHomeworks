package Day21_Each_Loop;

import java.util.Arrays;

public class unique_chars {
    public static void main(String[] args) {
        String word = "aaabbcc";
        String res = "";

        for (int i = 0; i < word.length(); i++) {
            String ch = "" + word.charAt(i);
            if (res.contains(ch)) {
                continue;
            } else {
                res += ch;
            }
        }
        System.out.println(res);
        System.out.println("______________________________");

        String word2 = "AAAAAAA";
        int frequency = 0;
        for (int i = 0; i < word2.length(); i++) {
            String ch = "" + word2.charAt(i);
            if (word2.contains(ch)) {
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
        System.out.println("________________________________________");

        for (int j = 0; j < 20; j++) { // j: 0, 1, 2, 3

            for (int i = 0; i < 5; i++) { //i: 0,1,2,3,4
                System.out.println("Wooden Spoon");
            }


        }


        System.out.println("_____________________________________________");
        char[] alphabets = new char[26];  //Z~A

        /*        i     ch
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
        */

        char ch = 'Z';
        for(int i = 0; i < alphabets.length; i++, ch-- ){
            alphabets[i] = ch;
        }

/*
        for(char i = 0, j = 'Z';  i < alphabets.length; i++, j-- ){
            alphabets[i] = j;
        }
*/

        //   System.out.println( alphabets );
        System.out.println( Arrays.toString(alphabets) ); // print the whole array
        //       System.out.println( alphabets[0] ); // printing the element of array



    }
}
