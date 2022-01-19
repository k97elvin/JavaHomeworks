package Day17_While_loop;

import java.util.*;


public class Frequency_of_Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String str = scan.next().toLowerCase();
        int frequency = 0;
        char ch = 'E';

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(ch==each){
                frequency +=1;
            }



        }
        System.out.println(frequency);
    }
}
