package day38_Inheritance.shape;

public class Square extends Shape{

    public double s;

    public Square(String name) {
        super(name);
        setS(s);
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {

        if (s<0){

            System.out.println("Invalid Input");

            System.exit(1);
        }
        this.s = s;
    }

    @Override
    public double area() {
        return s*s;
    }

    @Override
    public double perimeter() {
        return 4*s;
    }

    public String toString() {
        return "Square{" +
                ", name='" + name + '\'' +
                "Input =" + s +
                ", Area='" + area() + '\'' +
                ", Perimeter='" + perimeter() + '\'' +

                '}';
    }
}
