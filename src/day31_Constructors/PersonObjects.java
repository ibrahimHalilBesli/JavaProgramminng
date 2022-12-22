package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Xalo",'M',24);

        Person person2 = new Person("Umus",'F',26);

        person2.age=27;

        System.out.println(person1);
        System.out.println(person2);
    }
}
