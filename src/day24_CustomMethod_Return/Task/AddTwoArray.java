package day24_CustomMethod_Return.Task;

import java.util.Arrays;

public class AddTwoArray {

    /*
     7. Create a method named merge that passes two integer array
            parameters, the method can merge two integer arrays and return the new
            array
            Ex:
            arr1 = {1,2,3}
            arr2 = {4,5,6}
            merge(arr1, arr2) ====>
            {1,2,3,4,5,6}
     */

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 ={4,5,6};

       int[] addTwoArr= merge(arr1,arr2);

        System.out.println(Arrays.toString(addTwoArr));
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result= new int[arr1.length+ arr2.length];

        int index = 0;

        for (int each1 : arr1) {

            result[index++]=each1;
        }
        for (int each1 : arr2) {
            result[index++]=each1;
        }

        return result;
    }
}
