package weekReview.week08_10_29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        //if we know the elements of the array

        int[] arrayName = {1, 2, 3, 4, 5, 6};

        //if we don't know the elements we have to define size of array
        //use new keyord
        int[] array = new int[10];
        //put the values in an array
        array[0] = 10;
        array[1] = 10;
        array[3] = 10;
        array[4] = 10;
        array[5] = 10;
        array[6] = 10;
        array[7] = 10;
        array[8] = 10;
        array[9] = 10;


        //print the elements we need to use toString() method with Arrays utility class

        System.out.println(Arrays.toString(array));

        char[] letters ={'B','S','D','Y'};

        System.out.println(Arrays.toString(letters));

        System.out.println("Adam");

        //how tho get specific element
        System.out.println(letters[1]); //S
        System.out.println(letters[2]); //D

        boolean [] array1 = new boolean[3];

       // array1[0] = "trtrtrtrtrtrtr"; we can not put different data type

        //sort method is sorting elements to
        int[] numbers = {2,3,1,10,5};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        System.out.println("==============After sort========================");
        System.out.println(Arrays.toString(numbers));

        //equals method is using for compare two array! order of elements are important

        int[] array3 = {1,2,3};
        int[] array4 = {2,1,3};

        System.out.println(Arrays.equals(array3,array4));
        Arrays.sort(array4);

        System.out.println(Arrays.equals(array3,array4));


        //toCharArray()

        String str = "Adam";

        char[] letter = str.toCharArray();


        for (char ch : letter) {
            System.out.print(ch+" ");
        }
        System.out.println(Arrays.toString(letter));

        String nam= "Ibrahim Besli";

        char[] halo = nam.toCharArray();

        System.out.println(Arrays.toString(halo));

        //split{regex)

        String sentence = "java is a good language";

        String[] words =sentence.split(" ");

        for (String word : words) {
            System.out.println(word);

            ArrayList<Integer> sa = new ArrayList<>();



            ArrayList<Character> list = new ArrayList<>();

            for (char i = 'a'; i<='z';i++){
                list.add(i);
            }
            boolean result = list.containsAll(Arrays.asList('a','c','D'));

            System.out.println(result);
        }









    }
}
