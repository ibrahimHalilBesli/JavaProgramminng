package day32_Constructors;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet first = new Carpet(3,5,8,true);

        double a = first.calcCost();

        System.out.println(first);
        System.out.println(a);
    }
}
