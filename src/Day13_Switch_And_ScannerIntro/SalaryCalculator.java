package Day13_Switch_And_ScannerIntro;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter hourly rate: ");
        int rate = scan.nextInt();

        System.out.println("Enter weekly hours: ");
        int hours = scan.nextInt();

        System.out.println("Enter state tax: ");
        int stateTax = scan.nextInt();

        System.out.println("Enter federal tax: ");
        int federalTax = scan.nextInt();

        int salary = hours * rate;
        int sTax = salary - salary*stateTax/100;
        int fedTax = salary - salary*federalTax/100;
        int totalTax = sTax+fedTax;
        int net = salary - totalTax;

        System.out.println("salary: " + salary + "\nstate tax: " + sTax + "\nfederal tax: " +
                fedTax + "\ntotal tax: "+ totalTax + "\n" +
                "yhenet income: " + net );
    }
}
/*3.        1   Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
                    */