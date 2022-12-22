package day13_String;

import java.util.Scanner;

public class CheckCharecters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your String");

        String str =scan.nextLine();

        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        String str2 = (first== last)? "same" : "Not same String";
        System.out.println(str2);
        scan.close();
    }
}
