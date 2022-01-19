package Day10;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 1;
        if (age > 0 && age <= 2) {
            System.out.println("Infant");
        } else if (age > 2 && age < 6) {
            System.out.println("Toddler");
        } else if (age > 5 && age <= 9) {
            System.out.println("Kid");
        } else if (age > 9 && age < 13) {
            System.out.println("Pre-Teen");
        } else if(age > 12 && age <= 17) {
            System.out.println("teenager");
        }
        }
    }

/*
 age groups are:
	                    infant (1 - 2)
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