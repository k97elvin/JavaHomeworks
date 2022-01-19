package Day11_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 15;
        String result = "";
        if (number >= 1 && number <= 18) {
            result = (number <= 5) ? "elementary school" : (number <= 8) ? "middle school" : (number <= 12) ? "high school"
                    : (number <= 16) ? "college" : "grad School";
        } else {
            System.out.println("invalid number");
        }
        System.out.println(result);
    }
}
/* Create a class called GradeLevel, Given a number(byte) grade level determine and print which
school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */