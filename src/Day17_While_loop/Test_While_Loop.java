package Day17_While_loop;

import java.util.Scanner;
public class Test_While_Loop {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {

            if (i == 'c') {
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 0; i <= 11; i++) {
            if (i % 2 == 0) {
                continue;

            }
            System.out.print(i+" ");

        }
        System.out.println("__________________________________");



        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first num");
        int firstNum = scan.nextInt();
        System.out.println("Enter your first num");
        int secondNum = scan.nextInt();
        System.out.println("Ent operator:");
        char ch = scan.next().charAt(0);

        while (!(ch=='+' || ch =='-')){
            System.out.println("Re-enter");

            ch = scan.next().charAt(0);
        }


    }
}
