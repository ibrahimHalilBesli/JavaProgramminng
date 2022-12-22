package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array=removeElement(array,2);

        System.out.println(Arrays.toString(array));
    }

    public static int[] removeElement(int[] array, int index){
        int[] result ={};

        for (int i = 0; i < array.length; i++) {
            if (i!=index){
              result= ArraysUtility.addElement(result,array[i]);

            }
        }
        return result;
    }
}
