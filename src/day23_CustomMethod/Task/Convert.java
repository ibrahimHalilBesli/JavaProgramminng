package day23_CustomMethod.Task;

public class Convert {

    /*
    9. create a method that can convert dollar to euro
10. create a method that can can convert dollar to lira
11. create a method that can convert kg to lb
     */



        public static void dollarToEuro(double dollarAmount){
            double euro = dollarAmount * 1.13;
            System.out.println(dollarAmount+" dollar equal to "+euro+" euro");
        }

    public static void dollarToLira(double dollarAmount){

            double lira = dollarAmount*18.5;

        System.out.println(dollarAmount+"$ dollar equal to "+lira+" lira");
    }
    public static void kiloToLb(double kilo){

        double lB = kilo*2.20462;

        System.out.println(kilo+" kilo equal to "+lB+" LB");
    }
}



