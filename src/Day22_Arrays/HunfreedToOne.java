package Day22_Arrays;
import java.util.Arrays;
public class HunfreedToOne {
    public static void main(String[] args) {
     /* int num[] = new int[100];
        for(int i = num.length;i>=1;i--){
            System.out.print(i + " ");
            System.out.println();
            System.out.println("___________________________");
        for (int j = 0; j < num.length; j++) {

            for (int i1 = 1; i1 <= num.length; i1++) {

                num[j] += i1;
                System.out.print(i1 +" ");
            }
        }*/


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

            }System.out.println( Arrays.toString(alphabets) );
    }
}
