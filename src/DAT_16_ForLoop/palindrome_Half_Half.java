package DAT_16_ForLoop;

public class palindrome_Half_Half {
    public static void main(String[] args) {


            String polindrome = "civic";
            boolean isPolindrome = true;
            for (int i = 0; i < polindrome.length() / 2; i++) {
                if (polindrome.charAt(i) != polindrome.charAt(polindrome.length() - 1 - i)) {
                    isPolindrome = false;
                }
            }
            System.out.println(polindrome + " is polindrom word ? " + isPolindrome);
        }
    }
