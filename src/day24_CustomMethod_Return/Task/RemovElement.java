package day24_CustomMethod_Return.Task;

import java.util.Arrays;

public class RemovElement {

    /*
     10. create a method named removeElement that passes one integer
            array and one integer, the method removes the integer index from the
            integer array and returns the new array
            Ex:
            array = {10, 20, 30, 40, 50, 60}
            index = 2
            removeElement(array, index) ==== {10,
            20, 40, 50, 60}
     */

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60};

        int index = 2;

        int[] neuArr= removeEelement(array,index);

        System.out.println(Arrays.toString(neuArr));

    }

    public static int[] removeEelement(int[] array, int index) {

        int[] neuArr= new int[array.length-1];
        int co= 0;

        for (int i = 0; i < array.length; i++) {

            if (i==index){
                continue;
            }
            neuArr[co++]=array[i];

        }
        return neuArr;

    }
}
