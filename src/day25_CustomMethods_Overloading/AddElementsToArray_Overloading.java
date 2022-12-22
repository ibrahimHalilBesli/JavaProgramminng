package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {

        String[] names = {"Halo","Ramo","Musto","Fido"};
        char[] chars = {'H','R','M','F'};
        int[] age = {24,26,52,50};

       String[] arr =  addElement(names,"Zeyno");

        System.out.println("Names = " + Arrays.toString(arr));


    }

    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];

        int i = 0;
        for (int each: array){
            result[i++] =each;

        }
        result[i]=element;
        return result;

    }

    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for (double each: array){
            result[i++] =each;

        }
        result[i]=element;
        return result;

    }

    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];

        int i = 0;
        for (String each: array){
            result[i++] =each;

        }
        result[i]=element;
        return result;

    }

    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];

        int i = 0;
        for (char each: array){
            result[i++] =each;

        }
        result[i]=element;
        return result;

    }
}
