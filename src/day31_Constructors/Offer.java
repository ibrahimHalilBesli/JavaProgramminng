package day31_Constructors;

public class Offer {

    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTo;
    public boolean isWFH;
    public boolean isFulltime;


    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTo, boolean isWFH, boolean isFulltime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTo = hasPTo;
        this.isWFH = isWFH;
        this.isFulltime = isFulltime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTo=" + hasPTo +
                ", isWFH=" + isWFH +
                ", isFulltime=" + isFulltime +
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