package Switch_Statements.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner po;
    public BusinessAnalysts ba;
    public ScrumMaster sm;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTesters(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }
public double totalSalary(double hourly,int weeklyHours){
        return hourly*weeklyHours;
}


}
/*
 Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				ddTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers

 */