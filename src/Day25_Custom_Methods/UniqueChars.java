package Day25_Custom_Methods;

public class UniqueChars {
    public static void main(String[] args) {
uniqueChars("Salam");
    }
    public static void uniqueChars(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                unique += str.charAt(i);
            }

        }
        System.out.println(unique);
    }
}
/*
. create a method that can display the unique characters of a string
 */