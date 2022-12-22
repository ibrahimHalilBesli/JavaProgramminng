package day37_Inheritance.animalTask.phone;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("13 Pro","Large",1049,"White");

        System.out.println(iphone);

        Samsung samsung = new Samsung("galaxy s19","6Inc",900,"White");

        Nokia nokia = new Nokia("Brick","4inc",50,"Gray");

        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.facetime(1231231231);
        iphone.facetime("Xalo@hotmail-com");


        System.out.println("---------------------------------------------");

        samsung.call(911);
        samsung.text(1234567);
        samsung.freeze();

        System.out.println("-------------------------");

       nokia.selfDefense();
       nokia.call(1234567898);

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);


    }

}
