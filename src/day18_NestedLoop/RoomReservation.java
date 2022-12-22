package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {


        /*
          Create a class called RoomReservation, write a program for the room
        reservation:
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$
        the program asks the user which bedroom does he/she wants to
        reserve, and how many nights he/she is staying.
        Then Ask the user "would you like to reserve another room?""
        if yes ==> repeat the entire steps
        if no ==> return the  total price
        If user enters any invalid entry,  ask the user to re-
        enter until user provides a valid entry
         */
        int bed = 0;
        int totalprice = 0;


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Which bedroom does he/she wants to reserve?");
            String bedroom = scan.nextLine();
            while (!(bedroom.equalsIgnoreCase("King Bed") || bedroom.equalsIgnoreCase("Queen Bed") ||
                    bedroom.equalsIgnoreCase("single Bed"))) {
                System.err.println("Invalid Entry, Please try again");
                System.out.println("Which bedroom does he/she wants to reserve?");
                bedroom = scan.nextLine();
            }
            if (bedroom.equalsIgnoreCase("King Bed")) {
                bed = 120;

            } else if (bedroom.equalsIgnoreCase("Queen Bed")) {
                bed = 100;
            } else if (bedroom.equalsIgnoreCase("single Bed")) {
                bed = 80;

            }


            System.out.println("How many nights he she is staying?");
            int nights = scan.nextInt();
            totalprice = bed * nights;
            System.out.println("Would you like to reserve another room?");
            scan.nextLine();
            String bedroom2 = scan.nextLine();
            if (bedroom2.equals("no")) {
                System.out.println("Total price: " + totalprice);
                    break;
            }else if (bedroom2.equals("yes")){

               continue;
            }

        }
        scan.close();
        }

    }
