package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        System.out.println(student1);
        Student student2 = new Student("Ahme",'M'),
                student3 = new Student("Halo",155),
                student4= new Student("Ramo",10,'A'),
                student5=new Student("Cihad",'M',28),
                student6=new Student("Suhaib",'M',27,18),
                student7=new Student("Fido",'F',52,100,'A');

        Student[] students = {student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

    }
}
