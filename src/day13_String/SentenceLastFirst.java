package day13_String;

import java.util.Scanner;

public class SentenceLastFirst {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Firstname");
        String firstName = scan.nextLine();
        System.out.println("enter your Lastname");

        String lastName = scan.nextLine();
        char first = firstName.toUpperCase().charAt(0);
        char last = lastName.toUpperCase().charAt(0);
        System.out.println(first + "." + last);
        scan.close();
    }
}
