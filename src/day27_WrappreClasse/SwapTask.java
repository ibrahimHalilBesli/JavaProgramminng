package day27_WrappreClasse;

import java.util.Arrays;

public class SwapTask {

    public static void main(String[] args) {

        int[] result = {1,2,3,4,5,6};

        int[] neu= swapArr(result,1,3);

        System.out.println(Arrays.toString(neu));


    }

    /*
      2. Swap Task:
        2.1 Create a method named swap that passes three parameters: integer
        array, integer i, integer j. the method swaps the element at index i with
        the element at index j, and returns the new array
        Ex:
        arr = {10, 20, 30, 40, 50};
        swap(arr, 2, 4) ==>  {10, 20, 50, 40,
        30}
        2.2 Create the same function for double array, char array and string
        array
     */

    public static int[] swapArr(int[] array, int firstInd, int secInd){

        int[] result = new int[array.length];

        for (int i = 0,j=0; i < array.length;j++, i++) {

            if (firstInd==i){
                result[firstInd]=array[secInd];
                continue;
            }
            if (secInd==i){
                result[secInd]=array[firstInd];
                continue;
            }
            result[j]=array[i];



        }
        return result;
    }

    public static double[] swapArr(double[] array, int firstInd, int secInd){

        double[] result = new double[array.length];

        for (int i = 0,j=0; i < array.length;j++, i++) {

            if (firstInd==i){
                result[firstInd]=array[secInd];
                continue;
            }
            if (secInd==i){
                result[secInd]=array[firstInd];
                continue;
            }
            result[j]=array[i];



        }
        return result;
    }
    public static String[] swapArr(String[] array, int firstInd, int secInd){

        String[] result = new String[array.length];

        for (int i = 0,j=0; i < array.length;j++, i++) {

            if (firstInd==i){
                result[firstInd]=array[secInd];
                continue;
            }
            if (secInd==i){
                result[secInd]=array[firstInd];
                continue;
            }
            result[j]=array[i];



        }
        return result;
    }
    public static char[] swapArr(char[] array, int firstInd, int secInd){

        char[] result = new char[array.length];

        for (int i = 0,j=0; i < array.length;j++, i++) {

            if (firstInd==i){
                result[firstInd]=array[secInd];
                continue;
            }
            if (secInd==i){
                result[secInd]=array[firstInd];
                continue;
            }
            result[j]=array[i];



        }
        return result;
    }
}
