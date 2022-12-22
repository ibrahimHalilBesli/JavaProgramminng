package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
     String[] group1 = {"Jon","Zeyno","James"};
        String[] group2 = {"Halo","Kalo","Umut"};
        String[] group3 = {"Fidan","Mustafa","Hilal"};

     String[][] groups = new String[3][]; //index:0,1,2
     groups[0] = group1;
     groups[1] = group2;
     groups[2] = group3;

       // System.out.println(Arrays.toString(groups)); //toString() is for one dimensional Arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
 //index of the elements:0,   1 , 2  0, 1, 2, 3    0, 1, 2,  3,  4
        int[][] arr2D = {{10,20,30},{40,50,60,70},{80,90,100,110,120}};
        // index of Array    0           1                2

        System.out.println(Arrays.deepToString(arr2D));


        //{40,50,60,70}
        System.out.println(Arrays.toString(arr2D[1]));

        //11
        System.out.println(arr2D[2][3]);
                        //array ind: element ind






    }
}
/*

 */