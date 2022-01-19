package Day17_While_loop;

import java.util.Scanner;

public class Frequency_While {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String sentence = scan.nextLine();
        int frequency = 0;

        while(sentence.contains("Java")){
            sentence = sentence.replaceFirst("Java","");
            frequency++;
        }
        System.out.println(frequency);
    }
}
