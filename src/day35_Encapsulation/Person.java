package day35_Encapsulation;

public class Person {

    public String name, language;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static {
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;

    }

    public static void printPlanetName(){

        System.out.println("Planet name is: "+planet);

    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void eat(String food){

        System.out.println(name+" is eating "+food);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}
