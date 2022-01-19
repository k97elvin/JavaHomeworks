package Day25_Custom_Methods;

public class Anagram {
    public static void main(String[] args) {
        anagram("car", "car");
    }

    public static void anagram(String str1, String str2) {
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            String ch = "" + str1.charAt(i);
            while (!(str1.length() == str2.length() && str2.contains("" + str1.charAt(i)))) {
                System.out.println("\"" + str1 + "\"" + " and " + "\"" + str2 + "\"" + " is not anagram.");
                break;
            }

            if ((str1.length() == str2.length() && str2.contains("" + str1.charAt(i)))) {
                System.out.println("\"" + str1 + "\"" + " and " + "\"" + str2 + "\"" + " is anagram.");

            }
            break;
        }
    }
}
/*
 17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram


				0,1,2,3
 */