package Day11_NestedIf;

public class CampusTime {
    public static void main(String[] args) {
        int h = 7;
        if (h >= 0 && h <= 23) {
            if (h >= 8 && h <= 23) {
                System.out.println("Campus is open");
            } else {
                System.out.println("Campus is close");
            }
        } else {
            System.out.println("Wrong number");
        }

        System.out.println("________________________________");

        String result = (h >= 0 && h <= 23) ? (h >= 8 && h <= 23) ? "Campus is open" : "Campus is close" : "Wrong number";

        System.out.println(result);


    }
}

/*
.  Create a class called CampusTime,
an integer variable named time is given with a number between 1~24 has been initialized,
write a program that can find out if the campus is open or not.
Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message:
“open”  but if the time entered is outside of operating hours they should see: “ closed”
 */