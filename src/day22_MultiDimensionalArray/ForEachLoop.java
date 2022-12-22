package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][] arr2D = {{10,20,30},{40,50,60,70},{80,90,100,110,120}};

        for (int[] each1DArray : arr2D) {

            System.out.println(Arrays.toString(each1DArray));
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);

            }
        }




    }
}
