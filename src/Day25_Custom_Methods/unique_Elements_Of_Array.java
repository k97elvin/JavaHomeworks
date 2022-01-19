package Day25_Custom_Methods;

public class unique_Elements_Of_Array {
    public static void main(String[] args) {
        uniqueElements(new String[]{"salam", "salam", "hello", "hola"});

    }

    public static void uniqueElements(String[] str) {


            for (int j = 0; j < str.length; j++) {
                String element = str[j];
                int frequency = 0;
                for (int i = 0; i < str.length; i++) {
                    if (str[i].equals(element)){
                        frequency++;

                }
                    if (frequency ==1){
                        System.out.println(element);
                    }

            }


        }


    }
}
/*2 create a method that can display the unique elements of array
 */