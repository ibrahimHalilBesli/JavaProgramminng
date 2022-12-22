package day38_Inheritance.car;

public class Toyota extends Car{


    public Toyota( String model, int year, double price, double miles) {
        super("Toyota", model, year, price, miles);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }

    public void reliable(){

        System.out.println(brand+" is reliable");
    }
}
