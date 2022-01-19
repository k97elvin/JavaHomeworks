package Day17_While_loop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Would you like reserve room? ");
        String yn = scan.next().toLowerCase();

        while (!(yn.equals("yes") || yn.equals("no"))) {
            System.err.println("Invalid answer please re enter");
            yn = scan.next().toLowerCase();
        }
        if (yn.equals("yes")) {
            System.out.println("What type of room you like");
            String room = scan.next().toLowerCase();

            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.out.println("Invalid room");
                System.out.println("re enter");
                room = scan.nextLine().toLowerCase();
            }
            if (room.equals("king")) {
                System.out.println("120");
            } else if (room.equals("queen")) {
                System.out.println("100");
            } else {
                System.out.println("80");
            }

        } else {
            System.out.println("Have a nice day");
        }

        scan.close();
    }
}
/*Create a class called RoomReservation, write a program for the room reservation,
your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	 if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user
    			to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/