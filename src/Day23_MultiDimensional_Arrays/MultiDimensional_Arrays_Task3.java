package Day23_MultiDimensional_Arrays;

public class MultiDimensional_Arrays_Task3 {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        //2

        String[][] batch25Groups = new String[3][];
        batch25Groups[0] = batch25Group1;
        batch25Groups[1] = batch25Group2;
        batch25Groups[2] = batch25Group3;


        //3_______________________________________________________________________________________________
        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = new String[3][];

        batch24Groups[0] = batch24Group1;
        batch24Groups[1] = batch24Group2;
        batch24Groups[2] = batch24Group3;

//4___________________________________________________________________________________________________
        String[][][] cydeoStudents = new String[2][][];
        cydeoStudents[0] = batch25Groups;
        cydeoStudents[1] = batch24Groups;


        for (String[][] arr2d : cydeoStudents) {
            for (String[] arr1d : arr2d) {
                for (String each : arr1d) {
                    System.out.print(each + " ");
                }
                System.out.println();
            }
        }
    }
}
/*
3. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
		 		String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
		 		String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

		2. declare an array variable named batch25Groups with the length of three
				2.1 Assign batch25Group1, batch25Group2, batch25Group1=3 to each indexes of the variable
				batch25Groups
____________________________________________________________________________________________________________________
		3. given the following arrays:
				String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch24Group1, batch24Group2, batch24Group1=3 to each indexes of the
 				 variable batch25Groups


		5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups to
		the indexes of CydeoStudents

		6. Print the names of each students
 */