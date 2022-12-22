package weekReview.week08_10_29;

import java.util.ArrayList;
import java.util.Arrays;

public class Deneme {

    public static void main(String[] args) {

       // method4();

        /*
        double number = add(3.4);

        number += add("dual");
        number += add(Integer.parseInt("100"));
        number += add(11341L);
        number+= add(Float.parseFloat("50.8"));

        System.out.println(number);
    }
    public static int add(int n ){
        return 5;
    }
    public static double add (double d){
        return 2.5;

    }
    public static long add (String s ){
        return 10;

         */

        /*
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.remove(nums.size()-1);
        nums.add(2);
        nums.add(10);
        nums.add(0,6);
        nums.remove(1);
        nums.add(-7);
        nums.add(2,2);
        System.out.println(nums);


         */

        ArrayList<String> strs = new ArrayList<>();
        strs.add("j");
        strs.add(0,"1");
        strs.add("i");
        strs.add(2,"5");
        strs.remove(1);
        strs.add("e");
        strs.add("i");
        strs.remove("i");

        System.out.println(strs);

        ArrayList<Integer> as = new ArrayList<>();
        as.add(null);

        System.out.println(as);



    }
    public static int method4(char c, String s){
        if (s.contains(""+c)){
            return 1;

        }else {
            return 0;
        }
    }
}
