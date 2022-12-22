package day25_CustomMethods_Overloading.Task;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        int[] maxnum= {1,2,3,4,5,6,9,10,15};
       int max=  maxNumber(maxnum);

        System.out.println(max);


    }

    /*
     Task 2:
        1. create a method that can return the max number from an integer
        array
        2. create a method that can return the max number from double array
        3. create a method that can return the max number from long array
        4. create a method that can return the max number from short array
        5. create a method that can return the max number from float array
        6. create a method that can return the max number from byte array
     */

    public static int maxNumber(int[] arr){

         Arrays.sort(arr);
        int max =arr[arr.length-1] ;
        return max;
    }

    public static double maxNumber(double[] arr){

        Arrays.sort(arr);
        double max = arr[arr.length-1];
        return max;
    }
    public static long maxNumber(long[] arr){

        Arrays.sort(arr);
        long max = arr[arr.length-1];
        return max;
    }
    public static short maxNumber(short[] arr){

        Arrays.sort(arr);
        short max = arr[arr.length-1];
        return max;
    }
    public static float maxNumber(float[] arr){

        Arrays.sort(arr);
        float max = arr[arr.length-1];
        return max;
    }
    public static byte maxNumber(byte[] arr){

        Arrays.sort(arr);
        byte max = arr[arr.length-1];
        return max;
    }
}
