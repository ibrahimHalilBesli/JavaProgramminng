package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Ciger","Husky",'M',2,"Large","Black");
       dog.eat();
       dog.drink();
       dog.sleep();
       dog.move();
       dog.bark();
       //dog.hunt()
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Mavis","British",'F',5,"Small","White");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scractch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Braun");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);
    }
}
