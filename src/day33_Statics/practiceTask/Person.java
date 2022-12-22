package day33_Statics.practiceTask;

public class Person {
    public String name;
    public int age;
    public char gender;
    public static boolean hasNose= true;
    public static boolean hasWings= false;
    public static int numberOfHead= 1;
    public static int numberOfEyes = 2;



    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){

        System.out.println(name+" is eating "+food);
    }
   public void drink(String drink){
       System.out.println(name+" is drinking "+drink);
   }

   public void sleep(){
       System.out.println(name+" is sleeping");

   }

}


/*
1. Create a class named Person:
Attributes:
instance: name, age, gender
static: isHuman(boolean),
hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
Add a constructor that can set All the
fields (instances)
Actions:
eat(String food)
drink(String drink)
sleep()
toString()
 */
