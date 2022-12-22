package day35_Encapsulation.encapsulation.taskK.restaurant;

public class Person {

    private String name;
    private int employeID;
    private double hourlyRate;
    private boolean isFullTime;
    private int salary;


    public Person(String name, int employeID, double hourlyRate, boolean isFullTime, int salary) {
        this.name = name;
        this.employeID = employeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeID() {
        if (employeID<=0){
            System.err.println("Invalid Employe");
            System.exit(0);
        }
        return employeID;
    }

    public void setEmployeID(int employeID) {
        this.employeID = employeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", employeID=" + employeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
