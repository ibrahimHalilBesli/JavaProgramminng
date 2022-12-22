package day38_Overload.animal;

public class Eagle extends Animal{

    public Eagle(String name, String bread, int age, char gender, String size, String color) {
        super(name, bread, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating snake");
    }
}
