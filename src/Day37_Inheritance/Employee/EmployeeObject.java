package Day37_Inheritance.Employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Elvin",24, 'M',123,"SDET",120000);

        System.out.println(employee1);
    }
}
