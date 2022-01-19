package Day11_NestedIf;

public class SalaryAndTax_Calculation {
    public static void main(String[] args) {
        int salary = 75;

        Boolean married = true;


        if (salary >= 130 && married) {
            System.out.println(salary - salary * 30 / 100 + "k");
        } else if (salary >= 130 && !married) {
            System.out.println(salary - salary * 30 / 100 + "k");

        } else if (salary >= 100 && salary <= 129 && married) {
            System.out.println(salary - salary * 25 / 100 + "k");
        } else if (salary >= 100 && salary <= 129 && !married) {
            System.out.println(salary - salary * 30 / 100 + "k");
        } else if (salary >= 80 && salary <= 99 && married) {
            System.out.println(salary - salary * 20 / 100 + "k");
        } else if (salary >= 80 && salary <= 99 && !married) {
            System.out.println(salary - salary * 25 / 100 + "k");
        } else if (salary < 80 && married) {
            System.out.println(salary - salary * 15 / 100 + "k");
        } else {
            System.out.println(salary - salary * 20 / 100 + "k");
        }
    }
}
/*
 Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */
