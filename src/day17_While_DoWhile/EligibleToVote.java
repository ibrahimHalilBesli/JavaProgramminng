package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();

        while (!(age>=1 && age<=120)){
            System.err.println("Invalid Entry, please re-enter");
            age =scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid Entry, please re-enter");
            answer=scan.next().toLowerCase();
        }

        scan.close();
    }

}
