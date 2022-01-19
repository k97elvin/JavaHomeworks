package Day18_NestedLoop;

public class Stars {
    public static void main(String[] args) {
        String star = "*";
        for (int j = 0; j<10 ; j++) {


            for (int i = 0; i <=j; i++) {

                System.out.println(star);
                star += "*";
            }
        }
    }
}