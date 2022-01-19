package Day30_Custom_Class;

public class Offer {
    public String location;
    public String companyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean isFullTime;

    public Offer(String location, String companyName, String jobTitle, double salary, boolean hasBenefit,
                 boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", isFullTime=" + isFullTime +
                '}';
    }


}
/*
  1. Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

            Actions:
                setInfo(): sets all the instance variables
                toString(): returns the full info of the Offer Object
 */