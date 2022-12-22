package day28_ArrayList.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArr {

    /*
     4. write a program that can combine two String arrays into one arrayList
                    ex:
                        arr1 = {"A", "B", "C"};
                        arr2 = {"D", "E", "F", "G"};
                        list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A","B","C"));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList("D","E","F","G"));

        ArrayList<String> result = new ArrayList<>();

        utilities.ArrayList.combineArray(arr1,arr2);




    }

}
