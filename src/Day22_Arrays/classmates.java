package Day22_Arrays;

import java.util.Arrays;

public class classmates {
    public static void main(String[] args) {
        String []clasmates = {"Gunay", "Anna", "Zuhal" ,"Ahmet", "Maria", "Sinem","Elvin","Kanan","Abbas","Ramin"};
      /* for(String each:clasmates){

       }*/
        for (int i = 0; i < clasmates.length-1; i++) {
            System.out.println(clasmates[i].charAt(0));

        }
    }
}
