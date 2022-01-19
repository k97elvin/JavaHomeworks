package Day22_Arrays;
import java.util.Arrays;
public class hundreed {
    public static void main(String[] args) {
        int[] numbers = new int[1];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <= 100; j++) {
                numbers[i] += j;
                System.out.print(j + " ");
            }

        }

    }
}
/* create an array that has the numbers 1 to 100
 */