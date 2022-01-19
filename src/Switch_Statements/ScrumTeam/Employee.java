package Switch_Statements.ScrumTeam;

public class Employee extends Person {
    public int id ;
    public double salary;
    public String jobTitle;

    public Employee(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender);
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name+ " is working");
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*2. Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
							Hint: after creating setInfo method of employee class, you can call the inheritend setInfo() to set the name, age, and gender

				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed


 */