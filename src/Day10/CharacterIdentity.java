package Day10;

public class CharacterIdentity {
    public static void main(String[] args) {
        int ch = 45;
        if (ch >= 33 && ch <= 47) {
            System.out.println("Special characters");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Numbers");
        } else if (65 <= ch && ch <= 90) {
            System.out.println("Alphabetic Character");
        }
    }

}

/*. Create a class called Character Identity,
and write a program that can identify if the given character is a digit
or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */