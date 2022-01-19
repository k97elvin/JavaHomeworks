package Day21_Each_Loop;

public class Classmates {
    public static void main(String[] args) {

        String[] classmates = {"Elvin K", "Rza", "Hasan"};
        for (String each : classmates) {
            String result  = "";
            for (int i = 0; i < each.length(); i++) {

                result = each.charAt(0) + "" + each.charAt(each.indexOf(" ") + 1);

            }
            System.out.println(result);
        }


    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */