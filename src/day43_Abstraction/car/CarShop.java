package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

       // Car car = new Car("Cydeo","25","Blue",2022,10000);
        //We can not create object  from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord","Black",2019,3000);
        Audo audi = new Audo("Q","Blue",2020,45000);
        Tesla tesla = new Tesla("Model3","White",2021,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("----------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);

        System.out.println(honda);
    }
}
