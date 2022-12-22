package day20_Arrays;

public class TwoNumArr {
    /*
    7. Write a program that can print out the common elements from two integer
array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
     */
    public static void main(String[] args) {

        int [] arr1={1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        
        for (int i = 0; i < arr2.length; i++) {
             int a = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int b = arr2[j];
                if (a==b){

                    System.out.print(b);
                }
            }
        }


        /*

        for (int i : arr1) {
            for (int i1 : arr2) {
                if (i==i1){
                    System.out.print(i);
                }
            }


        }

         */
    }
}
