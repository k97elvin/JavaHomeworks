package Day33_Encapsulation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
      int nums[]={1,2,5,5,3};
        for (int i = 0, j = 1; i < nums.length && j < nums.length - 1; i++, j++) {
            if (nums[i] == 5 && nums[j] == 5) {
                System.out.println(true);
                break;
            } else if (nums[i] != 5 && nums[j] != 5) {
                System.out.println(false);
                break;
            }
        }
    }
}
