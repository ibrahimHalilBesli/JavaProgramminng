package day39_Recap.cydeo;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkut",22,'F',123,"Dev",100000);

        Tester tester = new Tester("Ramo",26,'M',2,"SDET",10000);

        Teacher teacher = new Teacher("Muhtar",29,'M',1,"Java Teacher",50000);

        Student student = new Student("Xalo",25,'M',12,"SDET");


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(student);
        System.out.println(teacher);

        System.out.println("----------------------");

        developer.setAge(22);

        System.out.println(developer.getAge());

        System.out.println(developer);


        developer.work();
        teacher.work();
        tester.work();

        System.out.println("-----------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("----------------");

        tester.eat();
        tester.createTicket();
        tester.drink();
        tester.eat();

        System.out.println("-------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();


        System.out.println(".----------------------------------");

        student.eat();
        student.drink();
        student.study();
        student.sleep();

    }
}
