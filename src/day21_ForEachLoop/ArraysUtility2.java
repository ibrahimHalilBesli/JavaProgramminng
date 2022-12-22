package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String[] earlyBirds = Arrays.copyOf(students,2);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers ={1,2,3,4,5,6,7,};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------");

        char[] ch1 ={'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6+1);  //excluded to 6 only 2,3,4,5 than +1

        System.out.println(Arrays.toString(ch2));

        int[] begEnd ={0,1,2,3,4,5,6,7,8,9};
        int[] result =Arrays.copyOfRange(begEnd,4,begEnd.length-1);

        System.out.println(Arrays.toString(result));

    }
}
