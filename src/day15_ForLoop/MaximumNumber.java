package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        int max = -999999999;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println("Enter a number");


            int num = scan.nextInt();

            if (num>max){
                max=num;
            }
        }
        System.out.println("max = "+max );
        scan.close();
    }
}
