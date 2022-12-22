package day07_Operators;

public class LeapYear {

    public static void main(String[] args) {

        //year = 2020 output 2020 is Leap year: true


        int givenYear = 2020;
        boolean leapYear = givenYear %4 == 0;
        
         if (leapYear){
            System.out.println(givenYear+" is leap year: "+ leapYear);

        } else{
            System.out.println("This is not leap Yeaar");

        }

        



    }
}
