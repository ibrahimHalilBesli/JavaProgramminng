package day38_Overload.car;

public class BMW extends Car{


    public BMW(String brand, String model, int year, double price, double miles) {
        super(brand, model, year, price, miles);
    }

    public void breaksDown(){

        System.out.println(brand+" is breaking down");
    }
}
