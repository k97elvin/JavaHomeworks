package Day22_Arrays;

public class Common_Elements_From_IntArray {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {4, 5, 6, 7, 8};

        for (int i = 0; i < num1.length; i++) {

            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j])
                    System.out.println(num1[i]);
            }

        }/*
        for(int i:num1){
            for(int j : num2){
                if (i==j){
                    System.out.println(j);
                }
            }
        }
*/
    }
}



/*7. Write a program that can print out the common elements from two integer array
        Ex:
        arr1: {1,2,3,4,5}
        arr2: {4,5,6,7,8}

        output:
        4 5
        */