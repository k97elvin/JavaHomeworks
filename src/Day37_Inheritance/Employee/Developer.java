package Day37_Inheritance.Employee;

public class Developer {
    public String name, jobTitle;
    public char gender;
    public int age, id, salary;

    public void  setInfo(String name, String jobTitle, char gender, int age, int id, int salary) {
    }
    public void work() {
        System.out.println(name + " is working");

    }
    public void testing() {
        System.out.println(name + " is coding");
    }
    public void fixingBug() {
        System.out.println(name + " fixing bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
2.3 Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */