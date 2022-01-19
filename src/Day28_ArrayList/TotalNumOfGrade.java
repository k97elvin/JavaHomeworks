package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TotalNumOfGrade {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOf_A = new ArrayList<>(scores);
        gradeOf_A.removeIf(p -> !(p > 90 && p <= 100));
        System.out.println(gradeOf_A);

        ArrayList<Integer> gradeOf_B = new ArrayList<>(scores);
        gradeOf_B.removeIf(p -> !(p > 80 && p <= 90));
        System.out.println(gradeOf_B);

        ArrayList<Integer> gradeOf_C = new ArrayList<>(scores);
        gradeOf_C.removeIf(p -> !(p > 70 && p <= 80));
        System.out.println(gradeOf_C);

        ArrayList<Integer> gradeOf_D = new ArrayList<>(scores);
        gradeOf_D.removeIf(p -> !(p > 60 && p <= 70));
        System.out.println(gradeOf_D);


        ArrayList<Integer> gradeOf_F = new ArrayList<>(scores); // 0 ~ 59
        gradeOf_F.removeAll(gradeOf_A);
        gradeOf_F.removeAll(gradeOf_B);
        gradeOf_F.removeAll(gradeOf_C);
        gradeOf_F.removeAll(gradeOf_D);

        System.out.println(gradeOf_F);


        System.out.println("gradeOf_A = " + gradeOf_A.size());
        System.out.println("gradeOf_B = " + gradeOf_B.size());
        System.out.println("gradeOf_C = " + gradeOf_C.size());
        System.out.println("gradeOf_D = " + gradeOf_D.size());
        System.out.println("gradeOf_F = " + gradeOf_F.size());

    }
}
/*8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F

 */