package day35_Encapsulation.encapsulation.taskK;

public class Carpet {

    private double width, length, unitPrice;
    private boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        this.isPersian = isPersian;
    }
    public void setWidth(double width) {
        if (width < 0) {
            System.err.println("Invalid Width: " + width);
            System.exit(0);
        }
        this.width = width;
    }

    public void setLength(double length) {

        if (length < 0) {
            System.err.println("Invalid Length: " + length);
            System.exit(0);
        }
        this.length = length;
    }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Invalid UnitPrice: " + unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }
    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost() {

        double totalPrice = (width * length) * unitPrice;

        if (isPersian) {
            totalPrice += 200;
        }
        return totalPrice;
    } //#
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public boolean isPersian() {
        return isPersian;
    }
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Price: " + calcCost() +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(1, 1, 10, true);

        System.out.println(carpet1);

    }

}
