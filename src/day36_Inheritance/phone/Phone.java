package day36_Inheritance.phone;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public void setInfo(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){

        System.out.println("calling from: 0"+phoneNumber);
    }

    public void text(long phoneNumber){

        System.out.println("is texting from: 0"+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    /*
    1. Phone Task:
1.1 Create a class named Phone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
toString()


1.5 Create a class named Phone Objects and test of the
sub class' objects
     */
}
