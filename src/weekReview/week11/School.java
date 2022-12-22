package weekReview.week11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Osi",'M','A', LocalDate.of(2000,1,1),21213);
        Student student2 = new Student("Xalo",'M','A', LocalDate.of(1998,2,7),21213);
        Student student3 = new Student("Fido",'F','A', LocalDate.of(1973,1,1),21213);
        Student student4 = new Student("Ramo",'M','F', LocalDate.of(1996,1,1),21213);

        students.add(student1);
        students.addAll(Arrays.asList(student2,student3,student4));
        
        ArrayList<Student> result = getStudentsNameStartsWithA(students);





    }

    public static ArrayList<Student> getStudentsNameStartsWithA(ArrayList<Student> students) {

        ArrayList<Student> result=new ArrayList<>();

        for (Student student : students) {

            if (student.name.startsWith("A")){
                result.add(student);
            }

        }

        return result;
    }
}
