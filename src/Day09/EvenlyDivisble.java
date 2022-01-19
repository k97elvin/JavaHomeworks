package Day09;

public class EvenlyDivisble {
    public static void main(String[] args) {
        int number = 120;
        if (number % 2 == 0 & number % 3 == 0 & number % 5 == 0) {
            System.out.println("number " + number + " is divisible 2,3,5.");
        }
    }
}

