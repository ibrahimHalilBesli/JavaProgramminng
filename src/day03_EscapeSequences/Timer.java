package day03_EscapeSequences;

import java.util.Scanner;

public class Timer {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of minutes");
        int minutes= scan.nextInt();
        scan.close();

        for (int i = minutes; i > 0 ; --i){
            if (i<0){
                break;
            }
        }
    }
    
}
