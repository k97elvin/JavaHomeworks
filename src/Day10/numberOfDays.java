package Day10;

public class numberOfDays {
    public static void main(String[] args) {
        int month = 1;
        if (month == 1) {
            System.out.println("Jan-31");
        } else if (month == 2) {
            System.out.println("Feb-28");
        } else if (month == 3) {
            System.out.println("March-31");
        } else if (month == 4) {
            System.out.println("April-30");
        } else if (month ==5) {
            System.out.println("may-31");
        } else if (month==6) {
            System.out.println("June-30");
        } else if (month==7) {
            System.out.println("Jule-31");
        } else if (month==8) {
            System.out.println("August-30");
        } else if (month==9) {
            System.out.println("September-31");
        } else if (month==10) {
            System.out.println("October-30");
        } else if (month==11) {
            System.out.println("November-31");
        } else if (month==12) {
            System.out.println("December-30");
        }

    }

}

/*
2. Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you,
write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 /*jan-31
        feb 28
        marc31
        april30
        may331
        jun330
        jul31
        aug30
        sep331
        oct30
        nov331
        dec30*/