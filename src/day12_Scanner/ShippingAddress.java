package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildig = scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your Country name");
        String country = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildig = " + buildig);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

        scan.close();








    }
}
