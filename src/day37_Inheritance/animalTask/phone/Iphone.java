package day37_Inheritance.animalTask.phone;

public class Iphone extends Phone{


    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);

    }

    public void facetime(long phoneNumber){

        System.out.println(brand+" "+model+" is having a facetime with "+phoneNumber);
    }
    public void facetime(String eMail){

        System.out.println(brand+" "+model+" is having a facetime with "+eMail);
    }
}
