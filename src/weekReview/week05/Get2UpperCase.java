package weekReview.week05;

import java.util.Scanner;

public class Get2UpperCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String result = ""+word.charAt(0)+word.charAt(1); //get links to right
        String result2 = word.charAt(0)+""+word.charAt(1);
        System.out.println(result.toUpperCase());
        System.out.println(result2.toUpperCase());
    }
}
