package day36_Inheritance.employee;

public class Developer extends Employee {

    /*
    2.3 Create the sub class of Employee named Developer:
variables:
name, gender, age, id, jobTitle, salary
Methods:
setInfo()
work()
coding()
fixingBugs()
toString()
     */

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixingBugs(){

        System.out.println(name+" is fixing bugs");
    }
}
