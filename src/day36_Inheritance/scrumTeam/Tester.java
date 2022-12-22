package day36_Inheritance.scrumTeam;

public class Tester extends Employee {
    public String testField;

    public void setInfo(String name, int age, char gender, int iD, String jobTitle, double salary, String testField) {
        this.testField = testField;
        setInfo(name, age, gender, iD, jobTitle, salary);



    }
    public void testing(){

        System.out.println(getName()+" is testing");
    }

}