package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 100;

        if (score>=0 && score<=100){
            if (score>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
          
        }   else {
            System.out.println("Invalid Score");
        }

        System.out.println("-----_______--------_______-------__");

        int age = 23;
        boolean hasId = true;

        if (hasId){

        if (age>=18){
            System.out.println("Eligible to buy alcohol");

        }   else {
            System.out.println("Not eligible to buy alcohol");
        }
        }else{
            System.out.println("You must have an ID to buy alcahol");
        }

        System.out.println("________-------------------");

        int number = 7;

        String day = null;
        

        if (number >= 0 && number <= 7){
            if (number == 1) {
                day = "Monday";

            } else if (number == 2) {
                day = "Tuesday";


            } else if (number == 3) {
                day = "Wednesday";
            } else if (number == 4) {
                day = "Thursday";
            } else if (number == 5) {
                day = "Friday";
            } else if (number == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }

        }   else {
            System.out.println("Invalid Number");
        }
        System.out.println("day = " + day);
    }
}
