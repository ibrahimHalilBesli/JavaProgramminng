package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26]; //Z->A

        // alphabets[0]='Z';
        char ch = 'Z';

        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }

        //System.out.println(alphabets);
        System.out.println(Arrays.toString(alphabets)); //print the whole array
        // System.out.println(alphabets[0]);          //printing the element of array


    }
}
