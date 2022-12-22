package day36_Inheritance.employee;

public class Teacher extends Employee{
    /*
    2.4 Create the sub class of Employee named Teacher:
variables:
name, gender, age, id, jobTitle, salary
Methods:
setInfo()
work()
teaching
toString()
     */

    public void teaching(){
        System.out.println(name+" is teaching");
    }
}
