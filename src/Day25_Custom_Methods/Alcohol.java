package Day25_Custom_Methods;

public class Alcohol {
    public static void main(String[] args) {
eligible(21);
    }


    public static void eligible(int age) {
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }
}