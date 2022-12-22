package day25_CustomMethods_Overloading.Task;

import java.util.Arrays;



public class MinNumber {

    /*
     1. create a method that can return the min number from an integer
        array
        2. create a method that can return the min number from double array
        3. create a method that can return the min number from long array
        4. create a method that can return the min number from short array
        5. create a method that can return the min number from float array
        6. create a method that can return the min number from byte array
     */
    public static int minNumber(int[]arr){

        Arrays.sort(arr);

        int min = arr[0];

        return min;
    }
    public static double minNumber(double[]arr){

        Arrays.sort(arr);

        double min=arr[0];
        return min;
    }

    public static short minNumber(short[] ch){

        Arrays.sort(ch);
        short min =ch[0];

        return min;

    }
    public static long minNumber(long[]arr){
        Arrays.sort(arr);

        long min = arr[0];
        return min;
    }
    public static float minNumber(float[]arr){
        Arrays.sort(arr);
        float min = arr[0];

        return min;
    }

}
