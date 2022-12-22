package day19_LoopPractice;

import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        /*
        2. Write a program that can calculate the area and perimeter of a
Square:
  1. Ask the user "Enter the side of the
  square:"
  if user enters 0 or negative numbers,
  terminate the program after displaying the error message "Invalid Entry
  for the side of the square"
  2. Display:
  1. Area of square
  2. Perimeter of square
  3. Ask the user "Would you like to calculate
  another Square?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Square Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
         */

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the sid of the square");
            double square = scan.nextDouble();
            double area = 3.14 * square * square;
            double perimeter = 3.14 * square * 2;
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);
            if (square < 0 || square == 0) {
                System.err.println("Invalid Entry");
                System.exit(0);

            }

            System.out.println("Would you like to calculate another Square");
            String calculate = scan.next();
            while (!(calculate.equals("yes")||calculate.equals("no"))) {
                System.err.println("Invalid Entrey Please Re-Enter");
                calculate = scan.next();
            }
            if (calculate.equals("yes")){
                continue;
            }            else {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }

        }
    }
}
