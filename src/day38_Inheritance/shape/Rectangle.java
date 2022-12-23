package day38_Inheritance.shape;

public class Rectangle extends Shape {

    public double l;
    public double w;

    public double getL() {
        return l;
    }

    public void setL(double l) {

        if (l < 0) {
            System.out.println("Invalid Input");

            System.exit(0);
        }
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        if (w < 0) {
            System.out.println("Invalid Input");

            System.exit(1);
        }

        this.w = w;
    }

    public Rectangle( double l, double w) {
        super("Rectangle");
        setL(l);
        setW(w);
    }

    @Override
    public double area() {
        return l*w;
    }

    @Override
    public double perimeter() {
        return 2*(l+w);
    }


}
