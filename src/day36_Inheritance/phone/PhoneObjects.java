package day36_Inheritance.phone;

public class PhoneObjects {

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.setInfo("Kebap","I20","Large",1099.5,"Blue");

        phone1.call(123456789);

        Iphone iphone =new Iphone();
        iphone.setInfo("Iphone","13 Pro","Max",1249,"Baby Blau");

        iphone.faceTime("ihalilbesl@icloud.com");
        iphone.faceTime(154154234);

        Samsung samsung = new Samsung();
        samsung.setInfo("galaxy S19", "6 inches", "White", 900,"Grau");

        Nokia nokia = new Nokia();
        nokia.setInfo("Brik", "4 inches", "Pink", 60,"Black");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }
}
