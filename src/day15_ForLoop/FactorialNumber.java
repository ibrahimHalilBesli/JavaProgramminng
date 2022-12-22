package day15_ForLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the guest's name:");
        String word = input.nextLine();

        System.out.println("Do you want to enter another guest's name?");
        String guest = input.next();

        if (guest.equalsIgnoreCase("no")){
            System.out.println("Guests' list: "+word);
        }

        while (guest.equalsIgnoreCase("yes")){
            System.out.println("Please enter the guest's name:");
            String word1 = input.next();
            System.out.println("Do you want to enter another guest's name?");
            String guest1 = input.next();
            if (guest1.equalsIgnoreCase("no")){
                System.out.println("Guests' list:"+word+", "+word1);
                break;
            }else {
                System.out.println("Please enter the guest's name:");
                String word2 = input.next();
            }

        }

    }
}