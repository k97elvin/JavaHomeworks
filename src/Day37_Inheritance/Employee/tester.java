package Day37_Inheritance.Employee;

public class tester extends Employee {
    public String name, jobTitle;
    public char gender;
    public int age, id, salary;

    public void setInfo(String name, String jobTitle, char gender, int age, int id, int salary) {
        this.age = age;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.name = name;
        this.id = id;
        this.salary = salary;
    }



    public void work() {
        System.out.println(name + " is working");

    }

    public void testing() {
        System.out.println(name + " is testing");
    }
    public void creatingTickets(){
        System.out.println(name + " creating tickets");
    }


    public String toString() {
        return "tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()


 */