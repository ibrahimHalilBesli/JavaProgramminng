package day17_While_DoWhile;

import java.util.Scanner;

public class NegNumber {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number ");
            int num1 = scan.nextInt();
            count += num1;

            if (num1 < 0) {
                break;
            }
        }
        System.out.println(count);
        /*
        2. Write a program that calculates the sum of numbers entered by the
        user until user enters a negative number.
        hint: you need an infinite loop
         */
        scan.close();
    }
}
