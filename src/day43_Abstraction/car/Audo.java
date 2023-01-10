package day43_Abstraction.car;

public final class Audo extends Car{
    public Audo( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start() {
        System.out.println("Started with Key");

    }
    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }
}
