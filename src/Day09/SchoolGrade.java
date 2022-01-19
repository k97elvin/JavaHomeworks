package Day09;

public class SchoolGrade {
    public static void main(String[] args) {


        byte age = 15;
        if (age >= 1 && age <= 5) {
            System.out.println("Elementary school");
        } else if (age > 5 && age <= 8) {
            System.out.println("Middle school");
        } else if (age >= 9 && age <= 12) {
            System.out.println("High school");
        } else if (age >= 13 && age <= 16) {
            System.out.println("College");
        } else if (age > 16 && age <= 18) {
            System.out.println("Grad school");
        }
    }
}
