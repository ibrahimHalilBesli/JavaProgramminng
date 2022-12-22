package day27_WrappreClasse;

import java.util.Arrays;

public class Insert {

    /*
    1. Insert Task:
        1.1 Create a method named insert that passes three
        parameters: integer array, integer index, integer element. the method
        inserts the given element to the given index of the array and returns the
        new array
        Ex:
        arr = {10, 20, 30, 40, 50};
        insert(arr, 2, 100) ==> {10,
        20, 100, 30, 40, 50}
        1.2 Create the same function for double array, char array
        and string array
     */

    public static void main(String[] args) {

        int[] array= {10,20,30,40,50};

        int[] result = insert(array,2,100);

        System.out.println(Arrays.toString(result));

        double[] arr= {10.5,20.1,21.3};

        double[] resuslt = insert(arr,1,15.5);

        System.out.println(Arrays.toString(resuslt));

    }

    public static int[] insert(int[] array, int i, int i1) {

        int[] result= new int[array.length+1];

        int index = 0;

        for (int each : array) {

            if (i==index) {
                result[index++]=i1;
                result[index++] = each;
            }else {
                result[index++] = each;
            }

        }
        return result;
    }

    public static double[] insert(double[] array,int index, double element){

        double[] result=new double[array.length+1];

        result[index]=element;

        for (int i = 0,j=0; i < array.length; i++, j++) {

            if (j==index){
                j++;
            }
            result[j]=array[i];

        }
        return result;

    }

    public static char[] insert(char[] array, int index, char element){
        char[] result = new char[array.length+1];

        result[index]=element;

        for (int i = 0,j=0; i < array.length; j++, i++) {

            if (j==index){
                j++;
            }
            result[j]=array[i];

        }
        return result;
    }
    public static String[] insert(String[] array, int index, String  element){

        String[] result = new String[array.length+1];
        result[index]=element;

        for (int i = 0,j=0; i < array.length;j++, i++) {

            if (index==j){
                j++;
            }
            result[j]=array[i];
        }
        return result;

    }
}
