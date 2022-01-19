package Day13_Switch_And_ScannerIntro;

import java.util.Scanner;

public class GradeReport_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score -");

        int score = scan.nextInt();
        char grade = 'B';
        if (score >= 0 && score <= 100) {
            if (score > 90) {
                System.out.println(grade = 'A');
            } else if (score > 80) {
                System.out.println(grade = 'B');

            } else {
                grade = 'C';

            }

        } else {
            System.out.println("invalid");
        }
    }
}
       /* if (score >= 0 && score <= 100){
            final char result = (score > 90) ? grade = 'A' : (score > 80) ? grade = 'B' : (grade = 'C');
        }else{
            System.out.println("invalid");
        }

        System.out.println(score);
    }
}

GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */