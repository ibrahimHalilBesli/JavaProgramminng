package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product Name");
        String productName= scan.nextLine();

        System.out.println("Enter the Price");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Enter their firstName");
        String firstName= scan.next();

        double total = price*quantity;

        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been places"+"\nYour total is "+total);

        scan.close();

    }
}
