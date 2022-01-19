package Day25_Custom_Methods;

public class initials {
    public static void main(String[] args) {
initials("Elvin","Karimli");
    }

    public static void initials(String firstName, String lastName) {
        String i1 = "" + firstName.toUpperCase().charAt(0);
        String i2 ="" +  lastName.toUpperCase().charAt(0);
        System.out.println(i1+"."+i2);
    }
}
