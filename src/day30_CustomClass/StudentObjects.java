package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 29, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2214, 'B');

        Student student3 = new Student();
        student3.setInfo("Fidan", 'F', 50, 2215, 'A');

        Student student4 = new Student();
        student4.setInfo("Halo", 'M', 24, 2220, 'A');

        Student[] students = {student1, student2, student3, student4};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); //grade A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A') {
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);

    }
}
