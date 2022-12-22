package day24_CustomMethod_Return.Task;

import java.util.Arrays;

public class AddElementArr {

    /*
      6. create a method named addElement that takes one integer array and
            one integer, the method can add the Integer number after the  last index
            of the integer array and returns the new array
            Ex:
            arr ={1,2,3};
            num = 4;
            addElement(arr, num) ==> {1,2,3,4}

     */

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int num = 4;

        int[] result =addElement(arr,num);

        System.out.println(Arrays.toString(result));

    }

    private static int[] addElement(int[] arr, int num) {

        int[] result= new int[arr.length+1];
        int index=0;

        for (int each : arr) {

            result[index++]=each;

        }
        result[index]=num;
        return result;
    }
}
