package Day34_Encopsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyObject {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Twix", 3, 0, false);
        Candy candy2 = new Candy("Twix2", 3, 0, false);
        Candy candy3 = new Candy("Twix3", 3, 0, false);
        Candy candy4 = new Candy("Twix4", 3, 0, false);
        Candy candy5 = new Candy("Twix5", 3, 0, false);
        ArrayList<Candy> list = new ArrayList<>();
        list.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));
        for (Candy candy : list) {
            System.out.println(candy.getBrand() + " " + candy.getPrice());
        }
    }
}
