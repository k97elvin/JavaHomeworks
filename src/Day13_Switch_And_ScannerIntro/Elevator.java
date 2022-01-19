package Day13_Switch_And_ScannerIntro;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 2;
        String company = "";
        switch (floorNum) {
            case 1 :
                company = "Lobby"+", Verizon,"+"Starbucks";
                break;
            case 2 :
                company = "Cybertek," + "NASA,"+ "Intelsat";
                break;
            case 3 :
                company = " Lyft," + " BofA," + " Stake house";
            default:
                System.out.println("Invalid floor - 6");

        }
        System.out.println("company : " + company);
    }
}
/*Create a class called Elevator. A variable named floorNumber is given,
write a program that can display the floor info

			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
				*/
