package Day14_String_Methods;

public class first_last_characters {
    public static void main(String[] args) {
        String sentence = "I don't like softskills class";
        char firstChar = sentence.charAt(0);
        int total = sentence.length() - 1 ;
        char lastChar = sentence.charAt(total);

        System.out.println("firstChar = " + firstChar + "\nlastChar = " + lastChar);

    }
}
