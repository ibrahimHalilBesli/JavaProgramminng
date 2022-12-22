package day38_Overload.car;

public class Car {

    public String brand;
    public String model;
    public int year;
    public double price;
    public double miles;

    public Car(String brand, String model, int year, double price, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start(){

        System.out.println(brand+" : "+model+" is started");
    }
    public void drive(){
        System.out.println(brand+" is driving");
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
