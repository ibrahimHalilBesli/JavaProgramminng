package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {






        String str = "Wooden Spoon"; //after line 13, "Wooden SPoon" will be eligible for garbage collection
        str = null;

        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1= null;

        System.out.println(car1);

        Dog dog1 =new Dog();
        dog1.name="Lucy";

        dog1 = new Dog();
        dog1.name="Max";

        System.out.println(dog1);

        String language = "Pyhton";
        language= "Java";

        System.out.println(language);

        System.out.println("----------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);


        Student student1 = new Student("Halo",23,'M','A',1500);

        Student student2 = student1;
        student1.name="Ramo";   //change student2 also

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("----------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Pyhton");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);







    }

}
