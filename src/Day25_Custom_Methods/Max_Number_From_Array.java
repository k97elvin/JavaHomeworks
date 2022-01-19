package Day25_Custom_Methods;

public class Max_Number_From_Array {
    public static void main(String[] args) {
        int i[] = {1, 3, 5, 7};
        int res = maxNum(i);
        System.out.println(res);
    }

    public static int maxNum(int[] numbers) {
        int max = 0;
        for (int each : numbers) {
            if (each > max) {
                max = each;
            }


        }

        return max;
    }


}
