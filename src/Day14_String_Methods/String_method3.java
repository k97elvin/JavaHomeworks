package Day14_String_Methods;

public class String_method3 {
    public static void main(String[] args) {
        String word = "Java Programming Language";

        String s1 = word.substring(0,  word.indexOf(" ") ) ;
        System.out.println(s1);

        String s2 = word.substring(word.indexOf(" ") + 1,   word.lastIndexOf(" ") );
        System.out.println(s2);

        String s3 = word.substring(word.lastIndexOf(" ")+1 );
        System.out.println(s3);
    }
}
