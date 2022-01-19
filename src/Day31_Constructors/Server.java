package Day31_Constructors;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder() {
        System.out.println(name+" is taking order.");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning table.");
    }


    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + ((fullTime) ? "full time" : "part time") +
                '}';
    }
}
/*6. Restaurant Task:
		6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

	        Actions: (all void methods)

	            setInfo(): sets all of the instance variables with some values taken from the parameters.
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

		6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

 */