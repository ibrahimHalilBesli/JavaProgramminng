package day37_Inheritance.animalTask.phone;

public class Nokia extends Phone {



    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense to ");
    }
}
