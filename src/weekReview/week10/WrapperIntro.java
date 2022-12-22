package weekReview.week10;

import java.util.ArrayList;

public class WrapperIntro {

    public static void main(String[] args) {



        int a =2;
        Integer b = 122;

        Integer c = new Integer(12);

        //Arraylist , we can not put primitive because we learn wrapper


        String number1 = "100";
        String number2 ="200";
        String result =number1+number2;
        System.out.println(result);
        //Converting string to int

        int result1 = Integer.parseInt(number1);//100
        int result2 = Integer.parseInt(number2);//200

        System.out.println(result1+result2);

        //what is the difference between parseInt() and valueOf()
        //valueOf() returns an Object (Wrapper Class)
        //parseInt returns primitive data type

        int i = Integer.parseInt("123");
        Integer integer  =Integer.valueOf("123");

        System.out.println(i);

        System.out.println(integer);

        //what is the difference between autoboxing and unboxing
        //autoboxing primitive ---> object(wrapper class)
        //unboxing object(wrapper) ---> primitive

        int i1 = 12;

        Integer integer1 = i1; //autoboxing primitive ---> object(wrapper class)

        Integer integer2 = 12;
        int i2 = integer2; //unboxing object(wrapper) ---> primitive

        ArrayList<Integer> arrayList = new ArrayList<>(); //this is collection
        arrayList.add(12); //index 0
        arrayList.add(15);
        arrayList.remove(Integer.valueOf("12")); // The method remove 12
        arrayList.remove(Integer.parseInt("0")); //The method remove 12


    }
}
