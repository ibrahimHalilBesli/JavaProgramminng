package day28_ArrayList.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirslast {

    /*
     2. write a program that can swap the first and last elements of an
        integer arraylist
                    ex:
                        list = [1,2,3,4,5];
                        output: [5,2,3,4,1];
     */

    public static void main(String[] args) {

        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(Arrays.asList(1,2,3,4,5));

        int first = result.get(0);

        result.set(0,result.get(result.size()-1));
        result.set(result.size()-1,first);

        int a = result.size();

        System.out.println(a);

        System.out.println(result);

    }

}
