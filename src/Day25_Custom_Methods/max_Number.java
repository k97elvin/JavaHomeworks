package Day25_Custom_Methods;

public class max_Number {
    public static void main(String[] args) {
        int max = maximumNumber(6, 9);
        System.out.println(max);
    }

    public static int maximumNumber(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }


}
