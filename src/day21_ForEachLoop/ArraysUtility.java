package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};

        System.out.println(nums);

        System.out.println(nums[0]);

        System.out.println(Arrays.toString(nums));

        int[] scores = {55,78,65,100,95};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        String[] names = {"Anna", "Gulay", "Umut", "Fidan","Mustafa","Ahmet"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words ={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("----------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};
        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("----------------------------");

        char[] ch1 = {'a','b','c'};
        char[] ch2 ={'c','b','a'};
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println(anagram);
        
        
        
        
    }
}
