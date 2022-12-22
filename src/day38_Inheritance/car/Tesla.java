package day38_Inheritance.car;

public class Tesla extends Car{

    public Tesla( String model, int year, double price, double miles) {
        super("Tesla", model, year, price, miles);
    }

    public void autoPilot(){

        System.out.println(brand+" "+model+" in autopilot model");
    }
}
