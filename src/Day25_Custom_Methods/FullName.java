package Day25_Custom_Methods;

public class FullName {
    public static void main(String[] args) {
        fullName("cYdEo", "SCHOOL");
    }

    public static void fullName(String firstN, String lastN) {
        System.out.print(firstN.substring(0, 1).toUpperCase() + firstN.substring(1).toLowerCase() + " " );
        System.out.println(lastN.substring(0, 1).toUpperCase() + lastN.substring(1).toLowerCase());
    }
}
/*
16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */