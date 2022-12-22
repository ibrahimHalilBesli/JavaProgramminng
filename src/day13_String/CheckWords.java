package day13_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your first Word");
        String str1 = scan.next();
        int num1 = str1.length()-1;

        System.out.println("Write your second Word");
        String str2 = scan.next();
        int num2 = str2.length()-1;

        System.out.println("Write your thirth Worth");
        String str3 = scan.next();
        int num3 = str3.length()-1;

        if (num1==num2&&num2==num3){
            System.out.println("All words are same length");
        } else if (num1==num2||num2==num3||num1==num3) {
            System.out.println("Not Same nor Different lengths");
        }else {
            System.out.println("All different length");
        }
        scan.close();
    }
}
