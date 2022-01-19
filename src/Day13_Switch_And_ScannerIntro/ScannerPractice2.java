package Day13_Switch_And_ScannerIntro;
import java.util.Scanner;
public class ScannerPractice2 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

       System.out.println("Enter name");
       String name = input.next();
        System.out.println(name);
        input.close();
    }
}
