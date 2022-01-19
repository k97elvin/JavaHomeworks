package Day13_Switch_And_ScannerIntro;

import java.util.Scanner;

public class Speed_Check {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your speed: ");
        int speed = scan.nextInt();

        if (speed>55){System.out.println("You're driving " + (speed-55) + " mph over the limit ");

        }

    }
}
/*
 Write a program for the speed check. a variable named speedLimit
 is given and assigned, ask user to enter the current speed,
 if the current speed is over the speedLimit print slow down,
 otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

 */