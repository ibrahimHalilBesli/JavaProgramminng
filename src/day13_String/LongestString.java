package day13_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String1");
        String str1 = scan.next();
        System.out.println("Enter your String2");
        String str2 = scan.next();
        int strn = str1.length() - 1;
        int str2n = str2.length() - 1;

        if (strn >str2n){
            System.out.println("The longest String: "+str1);
        } else if (str2n>strn) {
            System.out.println("The longest String: "+str2);

        }  
          scan.close();
    }


}
