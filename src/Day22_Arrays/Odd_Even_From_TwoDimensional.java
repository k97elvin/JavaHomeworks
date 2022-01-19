package Day22_Arrays;

public class Odd_Even_From_TwoDimensional {
    public static void main(String[] args) {
        int[][] numbers = {{1, 5, 3, 9}, {6, 8, 3, 2}};
        int oddCount = 0;
        int evenCount = 0;
        for (int i[] : numbers) {
            for (int j : i) {
                if (j % 2 == 0){
                    evenCount++;
                }
                if (j % 2 != 0){
                    oddCount++;
                }
            }
        }
        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);
    }
}
//2. Write a program that can count the total odd and even numbers from a two-dimensional array
