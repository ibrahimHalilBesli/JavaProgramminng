package day20_Arrays;

import java.util.Scanner;

public class MaxArr {
    /*
    1: kullanicidan array uzunlugu
    2:Kullanici sayilari giricek
    3:bu sayilarin arasindaki en büyük sayiyi bul ve yazdir
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ArrayLength");

        int arrayLe= scan.nextInt();
        int[] le = new int[arrayLe];
        int max = le[0];
        int max2= 0;
        for (int i = 0; i < le.length ; i++) {
            System.out.println("Enter a Number");
            le[i]=scan.nextInt();

            if (le[i]>max){
                max= le[i];
            }


        }
        for (int i = 0; i < le.length; i++) {
            if (max2<=le[i]&&le[i]<max){
                max2=le[i];
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
