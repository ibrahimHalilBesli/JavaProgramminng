package day38_Inheritance.animal;

public class Animal {

    public String name;
    public String bread;
    public int age;
    public char gender;
    public String size;
    public String color;

    public Animal(String name, String bread, int age, char gender, String size, String color) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
