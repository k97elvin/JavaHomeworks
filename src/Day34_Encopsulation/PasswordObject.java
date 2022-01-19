package Day34_Encopsulation;


public class PasswordObject {
    public static void main(String[] args) {

        Credentials credentials1 = new Credentials("Elvin", "elvinN");
        System.out.println(credentials1);
        credentials1.isStrongPassword();
    }
}
