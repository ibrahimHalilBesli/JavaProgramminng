package day04_Variables;

public class GallonsToLitters {
    //1 gallon = 3.79 litters
    //1000, 10000 gallons
    public static void main(String[] args) {
        int gallon = 1000;
        double litters = 3.79;
        double preis = gallon*litters;

        System.out.println("gallon = " + gallon);
        System.out.println("preis = " + preis);

        int Gallons = 10000;

        double Preis2 = litters*Gallons;
        int Preis12 = (int)Preis2;

        System.out.println("Gallons = " + Gallons);
        System.out.println("Preis12 = " + Preis12);
    }




}
