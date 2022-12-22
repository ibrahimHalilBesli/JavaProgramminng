package day38_Inheritance.car;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry",2020,20000,123456);

        Tesla tesla = new Tesla("Model X",2020,50000,12345);

        toyota.start();
        tesla.start();


        System.out.println(tesla);
        System.out.println(toyota
        );

    }
}
