package day35_Encapsulation.encapsulation.taskK;

public class Candies {

    /*
    1. CandiesTask
1.1 Create a custom class named Candy
private variables:
brand (String), quantity (int), price (double),
hasPeanuts (boolean)
Encapsulate All the private fields
(price of candy can not be set to negative)
(quantity of candy can not be set to zero or
negative)
Add a constructor that allows user to set all the fields
when the object is created.
(If the arguments not valid it should not be set
to the instances)
Extra methods:
toString():
if the price is zero, print "free" instead of 0

     */

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candies(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setPrice(price);
        setQuantity(quantity);
        setHasPeanuts(hasPeanuts);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity <= 0) {
            System.err.println("Invalid Quantity " + quantity);
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0) {
            System.err.println("Invalid Price" + price);
            System.exit(0);
        } else if (price == 0) {
            System.out.println("Free");
            this.price = price;
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        return "Candies{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
