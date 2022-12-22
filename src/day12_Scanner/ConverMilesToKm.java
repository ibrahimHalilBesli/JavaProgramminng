package day12_Scanner;

import java.util.Scanner;

public class ConverMilesToKm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your miles");
        double km =scan.nextDouble();
        double km2 =km*1.609;
        System.out.println(km+" miles equal to "+km2+" kilometers");
        scan.close();
        
    }
}
