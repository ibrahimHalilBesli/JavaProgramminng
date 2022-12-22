package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Speed");
        int currentSpeed =scan.nextInt();
        int speedLimit = 50;
        int overLimit= currentSpeed-speedLimit;

         if (overLimit>0){
             System.out.println("You're driving "+overLimit+" mph over the limit. Slow down");
         }
        /*
        int speedLimit = 65;
        int currentSpeed = 105;
        int overLimit = currentSpeed-speedLimit;

         */
        scan.close();


    }
}
