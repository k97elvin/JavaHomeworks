package Day22_Arrays;

public class Reverse_Classmates_Names {
    public static void main(String[] args) {
        String[] classmates = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem", "Elvin", "Kanan", "Abbas", "Ramin"};

        for (int i = 0; i < classmates.length; i++) {//each name
            String reverse = "";
           // String each = classmates[i];
            for (int j = classmates[i].length()-1; j>=0 ; j--) {// each char
                reverse+=classmates[i].charAt(j);
            }
            System.out.println(reverse);
        }

    }
}
/*2. create string array, and store the names of your  classmates (10)
            reverse each student's names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */