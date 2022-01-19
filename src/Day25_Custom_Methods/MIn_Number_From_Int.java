package Day25_Custom_Methods;

public class MIn_Number_From_Int {
    public static void main(String[] args) {
        int i[] = {1, 3, 5, 7};
        int res = maxNum(i);
        System.out.println(res);
    }

    public static int maxNum(int[] numbers) {
        int min = 200000;
        for (int each : numbers) {
            if (each < min) {
                min = each;
            }


        }

        return min;
    }


}
