package day19_LoopPractice;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         while (true) {
             System.out.println("Enter a number");
             int a = scan.nextInt();

             if (a % 2 == 0) {
                 System.out.println("Even Number");
             } else {
                 System.out.println("Odd Number");
             }

             System.out.println("Would you like to another number? (yes/no)");
             String yesOrNo = scan.next();

             if (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
                 System.err.println("Invalid Entry");
                 System.exit(0);
             }
             if (yesOrNo.equals("no")) {
                 System.out.println("Thank you For Calculator");
               break;
             }

         }
         scan.close();
    }
}
