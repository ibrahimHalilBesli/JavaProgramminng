package day07_Operators;

public class IntroPostIncrementDecrement {

    public static void main(String[] args) {

        int a = 5;

        System.out.println(a);

        System.out.println(a++);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a++);
        System.out.println(a);

        int b =10;
        System.out.println(b--);// first do action (print) we will print 10 and teh second change value 9
        System.out.println(b--);//i will print 9 and decrement it will be 8 for next statement
        System.out.println(b);
        

    }
}
