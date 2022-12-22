package day23_CustomMethod.Task;

public class OddNumbers {

    public static void main(String[] args) {

        oddNumbers();
        evenNumbers();
    }

    public static void evenNumbers(){

        for (int i = 0; i <= 100; i+=2) {

            System.out.print(i+" ");
        }
    }

    public static void oddNumbers(){

        for (int i = 1; i <= 100; i+=2) {

            System.out.print(i+" ");

        }
    }


    public static void eligibleToAlc(int age){

        if (age<18){

            System.out.println("You are not eligible to vote!");
        }else {
            System.out.println("You can eligible to buy alcahol");
        }


    }

    public static void eligibleToAlc(int age, String coutry) {

        if (age < 18) {

            System.out.println("You are not eligible to vote!" + coutry);
        } else {
            System.out.println("You can eligible to buy alcahol" + coutry);
        }
    }



        public static void areaOfCircle(double radius){
            double area = radius * radius * 3.14;
            System.out.println("area = " + area);
        }


    }

