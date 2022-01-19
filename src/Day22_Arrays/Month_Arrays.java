package Day22_Arrays;

import java.util.Arrays;

public class Month_Arrays {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
            System.out.println("___________________________");
        }
        System.out.println("_________________________");


        for (int i = months.length - 1; i > 0; i--) {
            System.out.println(months[i]);
            System.out.println("_____________________________________");


            String ta = "A ";
            ta = ta.concat("B");
            String tb = "C ";
            ta= ta+tb;
            ta.replace('C','D');

            System.out.println(ta);


        }
    }
}
