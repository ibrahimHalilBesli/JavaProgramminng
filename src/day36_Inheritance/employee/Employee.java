package day36_Inheritance.employee;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public int salary;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, int salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){

        System.out.println(name+" is working "+jobTitle);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*
    variables:
name, gender, age, id, jobTitle, salary
Methods:
setInfo()
work()
toString()
     */
}
