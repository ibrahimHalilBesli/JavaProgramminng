package day20_Arrays;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {
        /*
        5.  Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};

         */

        int[] num = {8,6,4,2,5};
        int [] reversednum = new int[num.length];
        int j = num.length-1;  /*
        for (int i = num.length - 1; i >= 0; i--) {
          reversednum[j]=num[i];
         


        }
        */
        for (int i : num) {
           reversednum[j]=i;
           j--;
        }
        System.out.println(Arrays.toString(reversednum));

    }
}
