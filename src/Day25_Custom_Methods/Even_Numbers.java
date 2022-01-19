package Day25_Custom_Methods;

public class Even_Numbers {
    public static void main(String[] args) {
        evenNumbers();
    }

    public static void evenNumbers() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}