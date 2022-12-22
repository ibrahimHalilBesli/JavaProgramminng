package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteringMultiDimArr {

    public static void main(String[] args) {

        int[][] arr2D = {{10,20,30},{40,50,60,70},{80,90,100,110,120}};

        for (int i = 0; i < arr2D.length; i++) {  //index numbers of single dimensional arrays
            //System.out.println(Arrays.toString(arr2D[i]));
            for (int i1 = 0; i1 < arr2D[i].length; i1++) {  //j: index number of elements

                System.out.print(arr2D[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
