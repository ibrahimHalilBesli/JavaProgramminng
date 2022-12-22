package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500,600};

        numbers=removeElements(numbers,1);//{100,300,400,500,600}

        System.out.println(Arrays.toString(numbers));//{100,300,400,500,600}

        numbers=removeElements(numbers,1);//{100,400,500,600}

        System.out.println(Arrays.toString(numbers));//{100,400,500,600}

    }


                                    //{1,2,3,4},   2
    //removes the index from the array, returns new array
    public static int[] removeElements(int[] array, int index){
        int[] result= new int[array.length-1]; //1,2

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index "+index);
            System.exit(0);
        }

        int j= 0;
        for (int i = 0; i<array.length;i++) {
            if (i == index){ //if the element of array is matching with the element at given index
                continue;//skip
            }
            result[j++]=array[i];

        }
         return result;
    }
    public static double[] removeElements(double[] array, int index){
        double[] result= new double[array.length-1]; //1,2

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index "+index);
            System.exit(0);
        }

        int j= 0;
        for (int i = 0; i<array.length;i++) {
            if (i == index){ //if the element of array is matching with the element at given index
                continue;//skip
            }
            result[j++]=array[i];

        }
        return result;
    }
    public static char[] removeElements(char[] array, int index){
        char[] result= new char[array.length-1]; //1,2

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index "+index);
            System.exit(0);
        }

        int j= 0;
        for (int i = 0; i<array.length;i++) {
            if (i == index){ //if the element of array is matching with the element at given index
                continue;//skip
            }
            result[j++]=array[i];

        }
        return result;
    }
    public static String[] removeElements(String [] array, int index){
        String [] result= new String[array.length-1]; //1,2

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index "+index);
            System.exit(0);
        }

        int j= 0;
        for (int i = 0; i<array.length;i++) {
            if (i == index){ //if the element of array is matching with the element at given index
                continue;//skip
            }
            result[j++]=array[i];

        }
        return result;
    }


}
