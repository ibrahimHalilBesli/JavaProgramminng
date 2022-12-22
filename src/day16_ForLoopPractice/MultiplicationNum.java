package day16_ForLoopPractice;

import java.util.Scanner;

public class MultiplicationNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scan.nextInt();

        System.out.println("Enter a secondNumber");
        int b = scan.nextInt();

        int multiplication = 0;
        for (int i = 0; i <b ; i++) {
            multiplication+=a;
            


        }
        System.out.println(multiplication);
        scan.close();
    }
}
