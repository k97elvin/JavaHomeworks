package Day11_NestedIf;

public class Grade {
    public static void main(String[] args) {
        char ex = 'A';
        String result = "";
        if (ex == 'A' || ex == 'B' || ex == 'C' || ex == 'D' || ex == 'F') {
            result = (ex == 'A') ? "excellent" : (ex == 'B') ? "great job"
                    : (ex == 'C') ? "good" : (ex == 'D') ? "passed" : "failed";
        } else {
            System.out.println("invalid number");
        }

        System.out.println(result);
    }
}
/*
3. Create a class called Grade, a char variable named grade is given.
 write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT



 */