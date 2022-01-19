package Day38.Emploee;

public class Tester extends Employee {

    public Tester(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is testing");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
