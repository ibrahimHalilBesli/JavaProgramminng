package weekReview.week11;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2MergeIntoArray {

    /*
    /*
Task 2 :
Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.
input:
first arraylist :1,2,3
second arraylist :4,5,6
output:
1,2,3,4,5,6
     */

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4,5,6));

        int[] merge = mergeIntoArray(first, second);

        System.out.println(Arrays.toString(merge));

    }
    public static int[] mergeIntoArray(ArrayList<Integer> first, ArrayList<Integer> second){

        int[] result = new int[first.size()+second.size()];

        int index = 0;

        for (Integer each   : first) {

            result[index++]= each;
        }

        System.out.println(index);

        for (Integer integer : second) {
            //I need to go on with 3 as  an index

            result[index++]=integer;
        }
        return result;


    }

}
