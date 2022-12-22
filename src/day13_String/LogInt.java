package day13_String;

import java.util.Scanner;

public class LogInt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Username:");
        String str1 = scan.next();
         boolean ss = str1.equals("Cydeo");

        System.out.println("Password: ");

        String str2 = scan.next();
        boolean ss1 = str2.equals("WoodenSpoon");

        if (ss == true && ss1== true){
            System.out.println("Logged in");
        }else {
            System.err.println("Incorrect username or password");
        }

        scan.close();
    }

}
