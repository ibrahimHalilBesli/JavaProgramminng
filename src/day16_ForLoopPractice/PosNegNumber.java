package day16_ForLoopPractice;

import java.util.Scanner;

public class PosNegNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positive = 0;
        int negative = 0;



         for (int i = 0; i<5; i++){
             System.out.println("Enter a Number");
             int a = scan.nextInt();
             if (a>0){
                 positive ++;
             } else if (a<0) {
                        negative++;
             }

         }
        System.out.println(positive+" Positive");
        System.out.println(negative+" Negativ");
        scan.close();
    }

    /*
    1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
        Ex:
        Inputs:
        10
        20
-1
0
3
Output:
3 positive and 1 negative
     */
}
