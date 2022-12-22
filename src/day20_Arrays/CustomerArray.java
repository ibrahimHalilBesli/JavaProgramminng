package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    /*
    1: Kullanicidan array uzunlugu
    2:Kullanicidan sayi iste
    3:tersine cevir ver
    4:2 ile carpilmis ver
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ArraysLength");
        int array=scan.nextInt();
         int[] arrayNum=new int[array];

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Enter a Number");
            arrayNum[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arrayNum));
        int [] doubleArray=new int[array];
        int[] reversedArr=new int[array];
        int a = 0;
        for (int i = arrayNum.length - 1; i >= 0; i--) {
             reversedArr[a]=arrayNum[i];
             doubleArray[a]=2*arrayNum[a];
             a++;
        }
        System.out.println(Arrays.toString(reversedArr));
        System.out.println(Arrays.toString(doubleArray));

        
    }
}
