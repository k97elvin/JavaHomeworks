package Day25_Custom_Methods;

public class HowManyDaysMonthsHave {
    public static void main(String[] args) {
        daysInMonth(2);
    }

    public static void daysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("30 days");
        }

    }
}
