package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Xalo",24,'M','A',"Harvard");

        student1.setAge(26);
        System.out.println(student1);

    }
}
