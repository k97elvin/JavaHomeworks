package Day11_NestedIf;

public class Finra {
    public static void main(String[] args) {
        int n = 35;

        if (n % 3 == 0 && n % 5 != 0) {
            System.out.println("FIN");
        } else if (n % 5 == 0 && n % 5 == 0) {
            System.out.println("RA");
        } else if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FINRA");
        } else {
            System.out.println("wrong number !!!");
        }
    }
}
/*
. Create a class called FINRA, Write a function which prints out the number.
but for number which is a multiple of 3, print "FIN" instead of the number and
 for number which is a multiple of 5,
 print "RA" instead of the number. and for number which is a multiple of both 3 and 5,
 print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */