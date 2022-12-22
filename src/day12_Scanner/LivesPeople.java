package day12_Scanner;

import java.util.Scanner;

public class LivesPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your: How many people live with");

        int people = input.nextInt();
        String livePeople = "";

        if (people < 3) {
            livePeople = "Live with less than 3 people";

        } else if (people >= 3 && people <= 6) {
            livePeople = "Live with 3-6 people";

        } else {
            livePeople = "Live with more than 6 people";
        }
        System.out.println(livePeople);
        input.close();
    }
}
