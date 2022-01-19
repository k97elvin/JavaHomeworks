package Day17_While_loop;

import java.util.Locale;
import java.util.Scanner;

public class Room2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which bed-r do yo want");
        String room = scan.next().toLowerCase();
        while (!(room.equals("King") || room.equals("Quinn") || room.equals("single"))) {
            System.out.println("Invalid re-enter");
            room = scan.next(

            ).toLowerCase();

        }


    }

}
/*
 write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

           1) the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she
            is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */



