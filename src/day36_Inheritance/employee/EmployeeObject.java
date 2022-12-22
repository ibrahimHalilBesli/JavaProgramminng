package day36_Inheritance.employee;

public class EmployeeObject {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Ramo",'M',27,23,"SDET",1099);

        Developer developer = new Developer();
        developer.setInfo("Ibo",'M',25,10,"BackEnd",25000);

        Driver driver= new Driver();
        driver.drivering();

        tester.testing();
        tester.work();
        developer.coding();
        developer.fixingBugs();
    }
}
