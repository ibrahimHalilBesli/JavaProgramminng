package day33_Statics.practiceTask;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Halo",24,'M');
        Person person2 = new Person("Ramo",26,'F');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);
    }
}
