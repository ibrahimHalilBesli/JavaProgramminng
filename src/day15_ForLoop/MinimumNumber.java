package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        int min = 999999999;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<5; i++){

            System.out.println("Enter a number");

            int num = scan.nextInt();

            if (num<min){
                min=num;

            }

        }
        System.out.println("Minimum number: "+min);
        scan.close();
    }
}
