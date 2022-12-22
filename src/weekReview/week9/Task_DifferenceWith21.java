package weekReview.week9;

public class Task_DifferenceWith21 {

    public static void main(String[] args) {


        /*
        Task 5 :  Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)
    method  parameter : no , or what kibd of data type --- interger
    method return type : void? --- integer
             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4
         */


        int res = diff21(19);
        System.out.println(res);
    }

    private static int diff21(int number) {


        return (number<21)? 21-number : (number-21)*2    ;
    }
}
