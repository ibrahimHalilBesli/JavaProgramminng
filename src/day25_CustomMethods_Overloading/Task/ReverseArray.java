package day25_CustomMethods_Overloading.Task;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};


        int[] result= reverseArray(arr);

        System.out.println(Arrays.toString(result));

    }

    /*
     Task 4:
        1. Create a method that can reverse an integer array
        2. Create a method that can reverse a double array
        3. Create a method that can reverse a char array
        4. Create a method that can reverse a String array
     */

    public static int[] reverseArray(int[]arr){

        int[] reverse= new int[arr.length];
        int index = arr.length-1;


        for (int element : arr) {

            reverse[index--]=element;

        }
        return reverse;
    }
    public static double[] reverseArray(double[]arr){

        double[] reverse = new double[arr.length];
        int index = arr.length-1;

        for (double element : arr) {
            reverse[index--]=element;
        }
        return reverse;
    }
    public static char[] reverseArray(char[] arr){

        char[] reverse =new char[arr.length];
        int index = arr.length-1;

        for (char ch : arr) {

            reverse[index--]=ch;
        }
        return reverse;
    }

    public static String[] reverseArray(String[] arr){

        String[]reverse =new String[arr.length];
        int index = arr.length-1;

        for (String each : arr) {

            reverse[index--]=each;
        }
        return reverse;
    }




}
