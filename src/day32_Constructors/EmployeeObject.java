package day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1= new Employee("Xalo");
        Employee employee2 = new Employee("Umut",'F');
        Employee employee3 = new Employee("Ramo",'M',"SDET");


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }

}
