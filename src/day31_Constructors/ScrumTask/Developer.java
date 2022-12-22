package day31_Constructors.ScrumTask;

public class Developer {

    public String name;
    public int employeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeID, String jobTitle, double salary) {
        this.name = name;
        this.employeID = employeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeID=" + employeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");

    }
    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }

    public int getId() {


        return 0;
    }
}

/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */
