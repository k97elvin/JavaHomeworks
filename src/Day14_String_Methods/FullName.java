package Day14_String_Methods;

public class FullName {
    public static void main(String[] args) {
        String firstName = "cyDEo",
                lastname = "School";
       firstName = firstName.substring(0, 1 ).toUpperCase() + firstName.substring(1).toLowerCase();
             //c                                 +  ydeo ==> "Cydeo"
        System.out.println(firstName);
    }
}
