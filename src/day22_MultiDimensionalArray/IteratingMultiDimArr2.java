package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimArr2 {

    public static void main(String[] args) {

        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100,110,120}};

        for (int i = arr2D.length - 1; i >= 0; i--) {  // i: index number of 1D arrays starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) { // j: index number of elements starting from 0 to last index
                System.out.print(arr2D[i][j]+" ");


            }
            System.out.println();
        }
        System.out.println("-.-.-.-.-.-.-.-.-------------");

        for (int i = 0; i < arr2D.length; i++) { // i: indexes of each 1D array started from 0

            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) { //i1 indexes of each element starting from last indec

                System.out.print(arr2D[i][i1]+" ");
            }
            System.out.println();
        }
        System.out.println(".-.-.---------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {

                System.out.print(arr2D[i][i1]+" ");

            }
            System.out.println();
        }

    }
}
