package day11_Switch_Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {

       String size = "tall";
        String price = "";

        boolean result =  size == "tall" || size == "grande" || size == "venti";

        if (result){
            switch (size){

                case "tall":
                    price = "price is 3.69$"+ "\n 90 calories";
                    break;
                case "grande":
                    price = "price is $3.99"+"\n 120 calories";
                    break;
                case "venti":
                    price = "price is $4.29"+"\n 150 calories";
                    break;

            }

        }   else {
            System.out.println("Invalid Grosse");
        }

        System.out.println( price);


    }
}
