package day23_CustomMethod.Task;

import java.util.Arrays;

public class PrintEachChar {

    public static void main(String[] args) {

        printEachChar("Halo");
        printEachElement(10,20,30);

    }


    //13. create a method named printEachChar that can print each
    //characters of a string

    public static void printEachChar(String charecter){


        for (int i = 0; i < charecter.length(); i++) {

            char ch = charecter.charAt(i);
            System.out.print(ch+" ");
        }
        System.out.println("");


    }

    public static void printEachElement(int number1, int number2, int number3 ){

        int[] arr= {number1,number2,number3};

        for (int each : arr) {

            System.out.print(each+" ");
        }

        System.out.println(Arrays.toString(arr));
    }
}
