package day25_CustomMethods_Overloading.Task;

import java.util.Arrays;

public class ArrayMerge {

    /*
     Task1:
        1. create a method that can merge two integer arrays.  
        2. create a method that can merge two double arrays.
        3. create a method that can merge two char arrays.
        4. create a method that can merge two String arrays.
     */

    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5};
        int[]arr1 = {1,2,2,2,4,5,6};

        int[] resul =mergeArr(arr1,arr);

        System.out.println(Arrays.toString(resul));


    }

    public static int[] mergeArr(int[]arr, int[]arr1){
        
        int[]result= new int[arr.length+arr1.length];
        int index = 0;

        for (int each1 : arr) {
            result[index]=each1;
            index++;
        }
        for (int each2  : arr1) {
            result[index++]=each2;
        }
        return result;


    }


    public static char[] mergeArr(char[]arr, char[]arr1){

        char[]result= new char[arr.length+arr1.length];
        int index = 0;

        for (char each1 : arr) {
            result[index]=each1;
            index++;
        }
        for (char each2  : arr1) {
            result[index++]=each2;
        }
        return result;


    }
    public static String[] mergeArr(String[]arr, String[]arr1){

        String[]result= new String[arr.length+arr1.length];
        int index = 0;

        for (String each1 : arr) {
            result[index]=each1;
            index++;
        }
        for (String each2  : arr1) {
            result[index++]=each2;
        }
        return result;


    }
    public static double[] mergeArr(double[]arr, double[]arr1){

        double[]result= new double[arr.length+arr1.length];
        int index = 0;

        for (double each1 : arr) {
            result[index]=each1;
            index++;
        }
        for (double each2  : arr1) {
            result[index++]=each2;
        }
        return result;


    }
}
