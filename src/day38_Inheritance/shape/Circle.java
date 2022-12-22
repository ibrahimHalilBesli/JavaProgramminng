package day38_Inheritance.shape;

public class Circle extends Shape{

    public double ra;
    public static double pi =3.14;

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public Circle(String name, double ra) {
        super(name);
        setRa(ra);

    }

    @Override
    public double area() {

        return pi*ra*ra;
    }

    @Override
    public double perimeter() {
        return 2*pi*ra;
    }

    public String toString() {
        return "Circle{" +
                "r=" + ra +
                ", name='" + name + '\'' +
                ", Area='" + area() + '\'' +
                ", Perimeter='" + perimeter() + '\'' +
                ", pi='" + pi + '\'' +
                '}';
    }
}
