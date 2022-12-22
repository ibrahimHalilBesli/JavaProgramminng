package day19_LoopPractice;

import java.util.Scanner;

public class AreaPerimeter {
    /*
    Tasks
    1. Write a program that can calculate the area and perimeter of a
    circle:
    1. Ask the user "Enter the radius of the
    circle:"
    if user enters 0 or negative numbers,
    terminate the program after displaying the error message "Invalid Entry
for the radius of the circle"
2. Display:
1. Diameter of circle
2. Area of circle
3. Perimeter of circle
3. Ask the user "Would you like to calculate
another circle?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Circle Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
     */
    public static void main(String[] args) {
        double diamater =0,
         area = 0,
         perimeter =0;

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();
            if (radius < 0 || radius == 0) {
                System.err.println("Invalid Entry");
                break;
            } else {
                 diamater = 2 * radius;
                 area = 3.14 * radius * radius;
                 perimeter = 3.14 * radius * 2;
            }
            System.out.println("diamater = " + diamater);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String calculate = scan.next();
            if (calculate.equals("yes")) {
                continue;
            } else if (calculate.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                      break;
            }   else {
                System.err.println("Invalid Entry");
            }
        }
    }
}
