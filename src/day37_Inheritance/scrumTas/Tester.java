package day37_Inheritance.scrumTas;

public class Tester extends Emloyee{  //Tester is as Employee, Tester is a Person
    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void createTicket(){

        System.out.println(jobTitle+" "+name+" is creating ticket");
    }
}
