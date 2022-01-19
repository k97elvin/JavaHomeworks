package Day13_Switch_And_ScannerIntro;

public class ageGroups {
    public static void main(String[] args) {
        int age = 1;
        String result = "";
        switch (age) {
            case 1: case 2:
                result = "infant";
                break;
            case 3: case 4: case 5:
                result = "toddler";
                break;
            case 6: case 7: case 8: case 9:
                result = "kid";
            default:
                result = "invalid";


        }
        System.out.println(result);
    }
}
  /*  write a program that can define the age groups of a person
    age groups are:
        infant ( 1 - 2 year)
        Toddler (3 - 5),
        Kid (6 - 9),
        Pre-Teen (10 - 12),
        Teenager (13 - 17),
        Young Adult (18 - 20),
        Adult (21 - 39),
        Young Middle-Aged Adult (40 - 49),
        Middle-Aged Adult (50 - 54),
        Very Young Senior Citizen (55 - 64),
        Young Senior Citizen (65 - 74),
        Senior Citizen (75 - 84),
        Old Senior Citizen (85+)

   */