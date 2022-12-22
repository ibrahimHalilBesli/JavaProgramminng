package weekReview.week11;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_GetUniqueElements {


/*
Task 3 :
Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.
first array :1,2,3,4,5
second array :4,5,6
output:
1,2,3,4,5,6
 */

    public static void main(String[] args) {

        int[] first = {1, 2, 3, 4, 5,5,5};
        int[] second = {4, 5, 6,6,7,7};


        //method returns the values in Arraylist
        ArrayList<Integer> result=getUniqueElements(first,second);
        //in order to create a method quick
        //for mac option+enter
        // for windows alt+enter

        System.out.println(result);

    }

    public static ArrayList<Integer> getUniqueElements(int[] first, int[] second) {
        ArrayList<Integer> result=new ArrayList<>();

        // ArrayList<Integer> result=new ArrayList<>(Arrays.asList(first));

        for (int i : first) {
            if (!result.contains(i))
                result.add(i);
        }
                //result=1, 2, 3, 4, 5
        for (int i : second) {
            if (!result.contains(i)) // I am cheking my each element from second then I am putitng in my result if it
                // is not in the result
                result.add(i);
        }

        return result;
    }
}
