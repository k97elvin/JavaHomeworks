package Day22_Arrays;

import java.util.Arrays;

public class Reverse_Second_Word_In_Sentence {
    public static void main(String[] args) {
        String str = "I Love Java";
        String[] strArrays = str.split(" ");
        String reverse = "";
        for (int i = 0; i < strArrays.length; i++) {
            if (i == 1) {
                for (int j = strArrays[i].length() - 1; j >= 0; j--) {
                    reverse += strArrays[i].charAt(j);
                }
                strArrays[1] = reverse;
            }
        }
        System.out.println(Arrays.toString(strArrays));
    }
}
/*
2. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java

 */