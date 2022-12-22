package day21_ForEachLoop;

import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,55,60};
        int[] result = new int[arr.length];

        for (int i = arr.length - 1, j=0; i >= 0; i--) {

            result[j]=arr[i];
            j++;
        }

        System.out.println(Arrays.toString(result));

    }
}
