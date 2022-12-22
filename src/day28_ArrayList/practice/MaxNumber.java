package day28_ArrayList.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> listad= new ArrayList<>();
        listad.addAll(Arrays.asList(1,2,3,4,5));

        int maxx =maximumNum(listad);

        int minu= minimumNumber(listad);

        System.out.println("minu = " + minu);
        System.out.println("maxx = " + maxx);


    }

    /*
    5. Write a program that can find the maximum number from an ArrayList of
        integers
        Ex:
        list = [1,2,3,4,5];
        output:
        5
     */

    public static int maximumNum(ArrayList<Integer> list){


        int max = list.get(0);

        for (Integer each : list) {
            if (each>max){
                max=each;
            }

        }

        return max;

    }

    public static int minimumNumber(ArrayList<Integer> list){

        int minimum = list.get(0);

        for (Integer each : list) {
            if (each<minimum)
                minimum=each;
        }
        return minimum;
    }
}
