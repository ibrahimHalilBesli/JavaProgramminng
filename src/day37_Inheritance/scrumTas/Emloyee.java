package day37_Inheritance.scrumTas;

public class Emloyee extends Person {  //Employee is a Person

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Emloyee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){

        System.out.println(jobTitle+" "+name+" is working");
    }


    public String toString() {
        return "Emloyee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=  $" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
