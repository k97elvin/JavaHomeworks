package Day36_Encapsualtion.restaurant;

public class Server {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean isFullTime() {
        return fullTime;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }
    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }

    public String fullTime(){
        String str= "";
        if(fullTime){
        str="Full- time";
        }else{
           str="Part-time";

        }
        return str;
    }


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime() +
                '}';
    }
}
/*6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

	        Actions: (all void methods)

	            setInfo(): sets all of the instance variables with some values taken from the parameters.
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"



 */