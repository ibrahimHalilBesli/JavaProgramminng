package day35_Encapsulation.encapsulation;

public class Circle {

    private int radius;
    public static double pi= 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public static double getPi() {
        return pi;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calcAre(int radius){

        double area=pi*radius*radius;

        return area;
    }
    public double calcPerimeter(int radius){

        double perimeter = 2*radius*pi;

        return perimeter;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " area=" + calcAre(radius) +
                " Perimeter=" + calcPerimeter(radius) +
                " Pi=" + pi +
                '}';
    }
}
