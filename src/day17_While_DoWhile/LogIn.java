package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        //username: Cydeo
        // password: Cydeo123

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged In");
        } else {
            int attemps = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attemps > 0) {
                System.err.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
                attemps--;

            }

            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged In");
            } else {
                System.out.println("Your Account is locked");
            }
        }
        scan.close();
    }

    }

