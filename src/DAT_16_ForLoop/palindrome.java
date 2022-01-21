package DAT_16_ForLoop;

public class palindrome {
    public static void main(String[] args) {
        String word = "Level";
        String reversed ="";
        for (int i = word.length()-1; i >= 0; i--) {
            reversed += word.charAt(i);

        }
        boolean result = word.equalsIgnoreCase(reversed);
        System.out.println("is palindrome;" +result);
    }
}




