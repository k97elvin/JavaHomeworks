package DAY_16_ForLoop;

import java.util.Scanner;

public class Sum_Of_Ints {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 101; i++) {

            sum+=i;

        }
        System.out.println("sum " + sum);
    }


}

