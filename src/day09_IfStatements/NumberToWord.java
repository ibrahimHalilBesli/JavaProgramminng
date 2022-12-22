package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {
          /*
          1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
           */
        int number = 1;
        String mean = "";
        if (number >= 0 || number <= 9) {

            if (number == 0) {
                mean = "Zero";

            } else if (number == 1) {
                mean = "One";

            } else if (number == 2) {
                mean = "Two";

            } else if (number == 3) {
                mean = "Three";

            } else if (number == 4) {
                mean = "Four";

            } else if (number == 5) {
                mean = "Five";
            } else if (number == 6) {
                mean = "Six";
            } else if (number == 7) {
                mean = "Seven";
            } else if (number == 8) {
                mean = "Eight";
            } else {
                mean = "Nine";
            }
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println("mean = " + mean);
    }
}
