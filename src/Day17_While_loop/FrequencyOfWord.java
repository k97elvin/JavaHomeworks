package Day17_While_loop;

import java.util.Locale;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String words = "elvinelvinevlinelvin";

        int frequencyWord = 0;

        for (int i = 0; i <= words.length() - 5; i++) {
            String eachSub = words.substring(i, i + 5);

            if (eachSub.equals("elvin")) {
                frequencyWord++;
            }
        }
        System.out.println(frequencyWord);
        System.out.println("___________________________________________");


    }
}
