package day37_Inheritance.scrumTas;

public class ProductOwner extends Emloyee{


    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
}
