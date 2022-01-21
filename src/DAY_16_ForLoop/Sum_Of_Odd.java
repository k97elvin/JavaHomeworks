package DAY_16_ForLoop;

public class Sum_Of_Odd {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 101; i++) {
            num += i++;

        }
        System.out.println(num);
    }
}
