package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number ");
        int first = scan.nextInt();

        System.out.println("Enter a math operator ");
        char math = scan.next().charAt(0);

        while (!(math == '+' || math == '-')) {

            System.err.println("Invalid Operator: " + math);
            System.exit(0);

        }
        System.out.println("Enter a second number");
        int second = scan.nextInt();

        if (math == '+') {
            System.out.println(first + second);
        } else {
            System.out.println(first - second);
        }

        scan.close();
    }
}
