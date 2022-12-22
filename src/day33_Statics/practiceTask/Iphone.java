package day33_Statics.practiceTask;

public class Iphone {

    public static String brand = "Apple Inc";

    public String model, color;

    public double price;

    public static String oS="IOS", madeIn = "China";

    public String size;

    public static void printOperatingSystem(){
        System.out.println(oS);
    }


    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods does not accept instances
    //  }


    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(oS);
    }

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){

        System.out.println(model+"is face timing with number : 0"+phoneNumber);

    }
    public void faceTime(String email){

        System.out.println(model+" is face timing with email "+email);

    }

    public void call(long phoneNumber){

        System.out.println(model+" is calling: 0"+phoneNumber);
    }

    public void text(long phoneNumber){

        System.out.println(model+" is texting to: 0"+phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    /*
    4. IPhone Task:
1. Creta a class named IPhone:
Attributes:
instance: model, price,
color, size
statics: brand, OS, madeIn
Add a constructor that can set All the
fields (instances)
Actions:
faceTime(long phoneNumber)
faceTime(String email)
call(long phoneNumber)
text(long phoneNumber)
toString()
     */


}
