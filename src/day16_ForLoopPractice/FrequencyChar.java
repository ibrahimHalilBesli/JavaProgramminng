package day16_ForLoopPractice;

import java.util.Scanner;

public class FrequencyChar {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.nextLine();

        System.out.println("Enter a Char");
        char ch = scan.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i <str.length() ; i++) {

            if (ch== str.charAt(i)){
                count++;

            }   else {
                continue;
            }


        }
        /*
        System.out.println(count);
        Write a program that asks user to entera string and a char, the
        returns the frequency of the char from the given string
        Ex:
        inputs:
        str = "aabcccd";
        char = 'c';
        output: 3
        inputs:
        "Java programming language"
        'g'
        output: 4
        
         */
        scan.close();

    }
    }

