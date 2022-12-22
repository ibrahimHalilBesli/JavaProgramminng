package day38_Inheritance.animal;

public class Tiger extends Animal{

    public Tiger(String name, String bread, int age, char gender, String size, String color) {
        super(name, bread, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating dear");
    }
}
