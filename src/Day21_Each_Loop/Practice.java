package Day21_Each_Loop;

public class Practice {
    public static void main(String[] args) {
      /*  String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for(String  each : words ){
            System.out.println( each.charAt(0)+ ""+ each.charAt( each.length()-1 )  );
        }*/
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) { // each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"

            int count = 0;

            for (String element : words) { // element: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                if (element.equals(each)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }

        }


    }
}
