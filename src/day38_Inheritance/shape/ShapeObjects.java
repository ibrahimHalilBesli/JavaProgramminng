package day38_Inheritance.shape;

public class ShapeObjects {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,5);

        System.out.println(rectangle);


        Circle circle = new Circle(7.5);


        System.out.println(circle);

        circle.setRa(15.5);

        System.out.println(circle.getRa());

        System.out.println(circle);

        System.out.println(circle.getName());
    }
}
