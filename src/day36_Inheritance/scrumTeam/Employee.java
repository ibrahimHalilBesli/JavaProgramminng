package day36_Inheritance.scrumTeam;

public class Employee extends Person {
    private int iD;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, int age, char gender, int iD, String jobTitle, double salary) {
        setInfo(name, age, gender);
        setiD(iD);
        setSalary(salary);
    }
    public void work(){
        System.out.println(getName()+" is working");
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Invalid Salary"+salary);
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +

                '}';
    }
}
