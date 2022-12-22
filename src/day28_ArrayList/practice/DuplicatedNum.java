package day28_ArrayList.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatedNum {

    /*
     7. Write a program that can return the first duplicated element from an
        arrayList of Integer
        Ex:
        list = [1,2,2,3,4,4,5,6,7,7];
        output:
        2
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,2,3,4,4,5,6,7,7));

        int firstDuplicate =0;

        int count = 0;

        for (Integer each : list) {

            for (Integer integer : list) {

                if (each==integer){

                    count++;

                }
            }
            if (count>1){
                 firstDuplicate =each;
                 break;
            }

            
        }
        System.out.println("firstDuplicate = " + firstDuplicate);

        
    }
}
