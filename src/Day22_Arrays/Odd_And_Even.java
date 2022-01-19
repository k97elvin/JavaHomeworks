package Day22_Arrays;

import java.util.Arrays;

public class Odd_And_Even {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        int even = 0;
        int odd = 0;
        System.out.println("even numbers: ");
        for (int each : numbers) {
            if (each % 2 == 0) {
                even++;
                System.out.print(each + " ");
            }

        }
        System.out.println();

        System.out.println("odd numbers: ");
        for (int each : numbers) {
            if (each % 2 != 0) {
                odd++;
                System.out.print(each + " ");
            }

        }

      /*  System.out.println("____________________________");

        for (int each : numbers) {
            System.out.print(each);

        }
        System.out.println();
        System.out.println("____________________________");

        for (int i = 0; i < numbers.length; i++) {
            int each2 = numbers[i];
            System.out.print(each2);

        }*/

    }

}

/*




	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops


    4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2


    5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}


	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)




 */