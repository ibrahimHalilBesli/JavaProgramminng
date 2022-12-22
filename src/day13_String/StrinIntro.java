package day13_String;

import java.util.Scanner;

public class StrinIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String str2 = "Wooden Spoon";
        String str3 = "Wooden Spoon";
        String str4 = "Wooden Spoon";

        System.out.println(str  == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println("----------------------------");


        String name = new String("Wooden Spoon");
        String name2 = new String("Wooden Spoon");
        String name3 = new String("Wooden Spoon");
        String name4 = new String("Wooden Spoon");

        System.out.println(name  == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2));

        String s3 = "java";
        String s4 = new String("Java");

        System.out.println(s3.equals(s4));

    }
}
