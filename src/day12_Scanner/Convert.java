package day12_Scanner;

import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Cents");
        int cents = scan.nextInt();
        int rem = cents % 10;
        int dollars = cents/10;
        System.out.println(cents+" cents equal to: "+ dollars+" dollars"+" and "+rem+" cents");
        scan.close();

    }
}
