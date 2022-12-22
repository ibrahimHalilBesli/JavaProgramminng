package day37_Inheritance.animalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Tarcin","Alman kurtu",'F',2,"Small","Brau");

        dog1.bark();

        System.out.println(dog1);

        Cat cat1 = new Cat("Love","Siamase",'F',2,"Large","White");

        cat1.scratch();

        System.out.println(cat1);

        Parrot parrot1 = new Parrot("King","Macaw",'M',3,"Small","Black");

        parrot1.sing();
        System.out.println(parrot1);
    }
}
