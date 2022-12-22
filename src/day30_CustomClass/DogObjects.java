package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "Red";

        Dog dog2 = new Dog();
        dog2.name = "Xalo";
        dog2.breed = "Kangal";
        dog2.age = 12;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White and Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Pasa", "Kurt", 19, 'M', "Extra Large", "Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra LArge", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Asi", "ALman kurdu", 6, 'M', "Small", "Blue");

        System.out.println(".....................................................");


    }

}
