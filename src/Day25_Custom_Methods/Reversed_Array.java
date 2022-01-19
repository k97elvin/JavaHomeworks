package Day25_Custom_Methods;

public class Reversed_Array {
    public static void main(String[] args) {


    }

    public static int Reversed(int[] given) {
        int reverse = 0;

        for (int i = given.length - 1; i >= 0; i--) {

            reverse += given[i];
        }

        return reverse;
    }


}
