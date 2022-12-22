package day35_Encapsulation.encapsulation.taskK;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {

        setName(name);

        setUnitPrice(unitPrice);

        setQuantity(quantity);
    }

    public void setName(String name) {


        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Invalid Name: " + name);
            System.exit(0);

        }
        String special = "";

        for (char element : name.toCharArray()) {
            if (!Character.isLetterOrDigit(element) && element != ' ') { // getting all special character except for space
                special += element;
            }
            if (special.length() > 0) { // if contains special characters other than space
                System.err.println("Invalid Name: " + name);
                System.exit(0);
            }
            if (!Character.isLetter(name.charAt(0))) { // if name not start with letter
                System.err.println("Invalid Name: " + name);
                System.exit(0);
            }
        }
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Invalid UnitPrice: " + unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {
            System.err.println("Invalid quantity: " + quantity);
            System.exit(0);
        }
        if (name.equalsIgnoreCase("toilet paper")) {
            quantity = 1;

        }
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calcCost() {

        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity=" + quantity +
                ", TotalPrice = $" + calcCost() +
                '}';
    }
}
 /*
    4. Item Task
4.1create a class called Item
            private variables:
            name, unitPrice, quantity
Encapsulate all the fields:
Conditions:
name can not be empty or blank
name can not contain any special
characters other than space
name must start with letters

unit price can not be negative
quantity can not be negative
if the Item name is toilet paper
(case insensitive) then the quantity can not be more than 1
Add a constructor that allows user to set all the fields when
the object is created.
(If the arguments
not valid it should not be set to the instances)
instance methods:
calcCost(): returns the total cost
toString(): returns the name, unit price, quantity and
total cost info as calculated by calcCost()
     */

class TestItem {

    public static void main(String[] args) {

        Item item1 = new Item("toilett paper", 10, 2);
        Item item2 = new Item("Sana Yag", -1, 10);

        System.out.println(item1);
        System.out.println(item2);
    }

}