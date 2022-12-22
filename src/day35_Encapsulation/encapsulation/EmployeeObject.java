package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1=new Employee("Xalo",'M',28,1000);

        System.out.println(employee1);
        employee1.setAge(32);
        System.out.println(employee1);

        System.out.println(employee1.getName());
    }
}
