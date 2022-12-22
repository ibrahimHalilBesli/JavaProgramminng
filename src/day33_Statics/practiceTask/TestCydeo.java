package day33_Statics.practiceTask;

public class TestCydeo {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Halo",25,10,15,'A');

        student1.attendClass();

        System.out.println(CydeoStudent.schoolName);
    }
}
