package day38_Overload.animal.employee;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int id, String jobTitle, String salaryName) {
        super(name, age, gender, id, jobTitle, salaryName);
    }

    @Override
    public void work() {
        System.out.println(name+" is testing");
    }
}
