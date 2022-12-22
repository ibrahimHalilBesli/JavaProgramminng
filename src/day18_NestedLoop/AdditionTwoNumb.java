package day18_NestedLoop;

import java.util.Scanner;

public class AdditionTwoNumb {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition "+ (num1+num2));

            System.out.println("would you like to continue? ");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){    //if the answer Invalid
                System.out.println("invalid Entry, Please Re Enter");
                a=scan.next();

            }
            if (a.equals("no")){
                System.out.println("Thank you For Calculation");
                break;                  //exits the outer loop
            }
        }
        scan.close();
    }
}
