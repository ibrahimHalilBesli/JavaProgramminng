package day12_Scanner;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares they have already?");
        int shares= scan.nextInt();

        System.out.println("How much is their total value in the stock market?");
        double stockMarket= scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter the name of the Company");
        String company = scan.nextLine();

        System.out.println("Your total stock market holding is $"+stockMarket+" which is made up of "+shares+" shares."+"\n"+company+" is your company holdings");

        scan.close();
    }
}
