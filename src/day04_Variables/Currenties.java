package day04_Variables;

public class Currenties {
    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 9.53 ;
        double euro = dollar * 1.16;
        //jpy, pound, peso, cad, riyal ...
        double JPY = dollar * 114.14;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.24;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("JPY = " + JPY);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);
        
    }
}
