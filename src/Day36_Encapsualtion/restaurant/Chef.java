package Day36_Encapsualtion.restaurant;

public class Chef {
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

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
       setName(name);
       setEmployeeID(employeeID);
       setHourlyRate(hourlyRate);
       setFullTime(fullTime);
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void  makeOrder(){
        System.out.println(name+ " making order");
    }
    public void washDishes (){
        System.out.println(name + " washes dishes");
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
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime() +
                '}';
    }
}
/*
6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

		            Actions: (all void methods)

		                setInfo(): sets all of the instance variables with some values taken from the parameters.
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"


 */