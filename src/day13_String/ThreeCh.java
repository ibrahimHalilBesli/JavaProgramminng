package day13_String;

import java.util.Scanner;

public class ThreeCh {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your three Characters word");

        String str = scan.next();
        int number = str.length();

        char middle = str.charAt(1);
        if (middle == 'a' && number == 3) {

            System.out.println("Cool Word");
        } else if (middle != 'a' && number == 3) {
            System.out.println("Okey Word");
        } else if (number > 3) {
            System.out.println("Word is too long");
        } else {
            System.out.println("Word is too short");
        }

        scan.close();
    }
}
