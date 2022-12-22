package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your Password");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged In");
        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect Username or Password");
                System.out.println("Enter your username");
                 username = scan.next();

                System.out.println("Enter your Password");
                 password = scan.next();
                if (username.equals("Cydeo")&&password.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                    break;
                }
            }
        }

        if (!(username.equals("Cydeo")&&password.equals("WoodenSpoon"))){
            System.out.println("Your Account is locked, please contact with SupportTeam");
        }

        
           scan.close();

    }
}
