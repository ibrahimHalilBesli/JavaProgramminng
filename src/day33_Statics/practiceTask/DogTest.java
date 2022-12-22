package day33_Statics.practiceTask;

public class DogTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Kangal","Gross","White",'F',15);

        dog1.eat();
        dog1.sleep();
        dog1.play();

        System.out.println(dog1);
    }
}
