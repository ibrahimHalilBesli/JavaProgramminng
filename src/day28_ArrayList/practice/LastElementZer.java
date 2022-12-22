package day28_ArrayList.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElementZer {
    /*
     1. write a program that can set the last element of the Integer arraylist
        to zero
                    ex:
                        list = [1,2,3,4,5];
                        output: [1,2,3,4,0];
     */

    public static void main(String[] args) {

        ArrayList<Integer > list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> result = getZero(list);

        System.out.println(result);

    }

    public static ArrayList<Integer> getZero(ArrayList<Integer> list) {


        list.set(list.size()-1,0);

        return new ArrayList<>(list);

    }
}
