package day38_Inheritance.animal.employee;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, String jobTitle, String salaryName) {
        super(name, age, gender, id, jobTitle, salaryName);
    }

    @Override
    public void work() {
        System.out.println(name+" is driving");
    }
}
