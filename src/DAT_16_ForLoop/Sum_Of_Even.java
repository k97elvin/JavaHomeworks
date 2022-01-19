package DAT_16_ForLoop;
import java.util.Scanner;
public class Sum_Of_Even {
    public static void main(String[] args) {

        int num = 0;
        for (int i =0 ; i < 101; i++) {
            num+=i++;
        }
        System.out.println(num);
    }
}
