package day21_ForEachLoop;

import java.util.Arrays;

public class EvenAndOddNumbers {

    public static void main(String[] args) {


    int[] arr = {10,20,23,43,55,66};

    int countEven=0;
    int countOdd=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                countEven++;
            }else {
                countOdd++;
            }

        }

        System.out.println(Arrays.toString(arr) +" has "+countEven+" even numbers and "+countOdd+" odd numbers");
}
}
