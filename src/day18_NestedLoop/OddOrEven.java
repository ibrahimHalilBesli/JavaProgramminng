package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    /*
    2. Write a program that asks user to enter a numnber , and check if the
number is odd or even.
if it's odd, print "Odd Number"
if it's even, print "Even number"
Ask the user "Would you like to enter another number"
if user enters yes, repeat the previous steps
if user enters no, print nothing
If user enteres invalid answer, repeat the previous steps
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num%2==0){
                System.out.println(num+" is a Odd Number");

            }   else {
                System.out.println(num+" is a Even Number");

            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();
              while (!(a.equals("yes")||a.equals("no"))){
                  System.err.println("Invalid Answer, Please Re Enter");
                  a=scan.next().toLowerCase();
              }
              if (a.equals("no")){
                  break;
              }

        }
        scan.close();

        }

    }

