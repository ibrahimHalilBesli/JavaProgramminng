package day20_Arrays;

import java.util.Arrays;

public class Alphabets2Method {

    public static void main(String[] args) {

        char alphabets[]=new char[26];

        for (char i = 0, j='Z'; i <alphabets.length ; i++, j--) {

            alphabets[i]= j;



        }
        System.out.println(Arrays.toString(alphabets));
    }
}
