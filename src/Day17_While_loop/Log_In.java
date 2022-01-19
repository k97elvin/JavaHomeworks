package Day17_While_loop;

import java.util.Scanner;

public class Log_In {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter login");
        String log = scan.next();
        System.out.println("Enter pas");
        String pas = scan.next();

        if (log.equals("Cydeo")&& pas.equals("Cydeo123")){
            System.out.println("logged in");

        }else {
            int chanche = 3;
            while(!(log.equals("Cydeo")&& pas.equals("Cydeo123")&&chanche>0)){
                System.err.println("Invalid pas or log re_enter");
                System.out.println("Enter login");
                log = scan.next();
                System.out.println("Enter pas");
                log = scan.next();
                chanche--;
            }



        }




    }
}
