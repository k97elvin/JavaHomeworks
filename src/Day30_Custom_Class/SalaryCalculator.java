package Day30_Custom_Class;

public class SalaryCalculator {
    double hourlyRate, stateTax, federalTax;
    int weeklyHour;

    public SalaryCalculator(double hourlyRate, double stateTax, double federalTax, int weeklyHour) {
        this.hourlyRate = hourlyRate;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
        this.weeklyHour = weeklyHour;
    }

    public double calculateSalary() {
        return hourlyRate * weeklyHour * 52;
    }

    public double totalStateTAx() {
        return hourlyRate * weeklyHour * 52 * stateTax / 100;
    }

    public double totalFederalTAx() {
        return hourlyRate * weeklyHour * 52 * federalTax / 100;
    }

    public double salaryAfterTax() {
        return hourlyRate * weeklyHour * 52 - totalFederalTAx() - totalStateTAx();

    }

    public String toString() {
        return "SalaryCalculator{" +

                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", weeklyHour=" + weeklyHour +
                ", salary after tax=" + salaryAfterTax() +
                ", salary = " + calculateSalary() +
                '}';
    }
}
/*1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */