package Day13_Switch_And_ScannerIntro;
import java.util.Scanner;

public class nextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name ");
        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

    }
}
