package Day25_Custom_Methods;

public class domainOfEmail {
    public static void main(String[] args) {
        email("elvin.kerimli2011@gmail.com");
    }

    public static void email(String givenEmail) {
        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1);
        System.out.println(domain);
        //.charAt(givenEmail.indexOf('@'))
    }
}
