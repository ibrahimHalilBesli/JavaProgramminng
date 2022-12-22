package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNum {
    public static void main(String[] args) {

        /*
        Write a program that can calculate two numbers.
        1. Ask user to enter the first number
        2. Ask user to enter a math operator (+,-
        ,/,*)
        (if user enters any invalid operator,
        repeat this step until user provides a valid operator)
        3. Ask user to enter the second number
        4. Display the result
        5. Ask user if they want to continue?
        (yes/no)
        if yes ==> repeat the entire steps
        if no ==> print "Thanks for using Cydeo
        c   alculator!"
        I   f user enters any invalid entry,  ask
        the user to re-enter until user provides a valid entry
         */

        Scanner scan = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("First Number");
            int first = scan.nextInt();

            System.out.println("Math Operator");
            char ch = scan.next().charAt(0);
            while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.err.println("Invalid Operator, Please give Valid Operator");
                ch = scan.next().charAt(0);
            }

            System.out.println("Second Number");
            int second = scan.nextInt();
            if (ch == '+') {
                total = first + second;
            } else if (ch == '-') {
                total = first - second;
            } else if (ch=='*') {
                             total=first*second;
            }                                   else {
                total=first/second;
            }
            System.out.println("Total: "+total);

            System.out.println("Want they to continue?");
            String yesOrNo= scan.next();
            while (!(yesOrNo.equals("yes")||yesOrNo.equals("no"))){
                System.err.println("Please Re-Enter Valid Entry");
                yesOrNo= scan.next();
            }
            if (yesOrNo.equals("yes")){
                continue;
            }            else {
                System.err.println("Thanks for using Cydeo Calculator!");
                break;
            }
        }
        scan.close();
    }
}
