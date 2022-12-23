package day38_Inheritance.shape;

public class Circle extends Shape{

    public double radius;
    public static double pi =3.14;

    public double getRa() {
        return radius;
    }

    public void setRa(double radius) {
        this.radius = radius;
    }

    public Circle( double radius) {
        super("Circle");
        setRa(radius);

    }

    @Override
    public double area() {

        return pi*radius
                *radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "r=" + radius +
                ", Area='" + area() + '\'' +
                ", Perimeter='" + perimeter() + '\'' +
                ", pi='" + pi + '\'' +
                '}';
    }
}
