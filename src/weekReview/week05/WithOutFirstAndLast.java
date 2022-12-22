package weekReview.week05;

import java.util.Scanner;

public class WithOutFirstAndLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();
        String result = "";

        if (word.length()<=2){
            result=word;
        }
        else {
            result = word.substring(1,word.length()-1);
        }

    }
}
