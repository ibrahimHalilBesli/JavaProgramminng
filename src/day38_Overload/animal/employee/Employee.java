package day38_Overload.animal.employee;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public int id;
    public String jobTitle;
    public String salaryName;
    public static String compamyName = "Cydeo";

    public Employee(String name, int age, char gender, int id, String jobTitle, String salaryName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
    }

    public void work(){

        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryName='" + salaryName + '\'' +
                ", Company Name='" + compamyName + '\'' +

                '}';
    }
}
