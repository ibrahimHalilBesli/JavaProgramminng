package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "I love learning java programming language";

        String[] ana =str.split(" ");

        System.out.println(Arrays.toString(ana));

        String email ="WoodenSpoon@cydeo.com";
        String[] arr =email.split("@");

        System.out.println(Arrays.toString(arr));

        String day = "Today is nice day. Today is Monday. Today we learn Java.";
        String[] sentences = day.split("\\.");

        System.out.println(Arrays.toString(sentences));





    }
}
