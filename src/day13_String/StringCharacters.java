package day13_String;

import java.util.Scanner;

public class StringCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your String");
        String str = scan.nextLine();

        int str1 = str.length();

        if (str1 == 0) {
            System.out.println("String is empty");
        } else if (str1 > 3) {
            System.out.println("String is last three Characters");
        } else {
            System.out.println(str);
        }
        scan.close();
    }
}
