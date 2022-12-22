package day20_Arrays;


/*
create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */
import java.util.Arrays;
import java.util.Scanner;

public class ClassMates {

    public static void main(String[] args) {
        
        String[] classmates ={"Halil Besli","Salo Besli","Umutcan Besli","Metin Acir"};
        String initials = "";
        String result = ";";
        for (int i = 0; i < classmates.length; i++) {

            initials =classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1);

            System.out.println(initials);

            }

        }

        }



