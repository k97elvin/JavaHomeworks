package Switch_Statements.ScrumTeam;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void developing(){
        System.out.println(name + " is developing.");
    }

}
