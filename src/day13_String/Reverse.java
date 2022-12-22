package day13_String;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your word");
        String str1 = scan.next();
        int num = str1.length();

        String result = "";
        if (num==5){
            result= str1;

        } else if (num>5) {
            result= "Too long!";
        }else {
            result="Too short!";
        }
        System.out.println("result = " + result);
         scan.close();
    }

}
