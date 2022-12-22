package day07_Operators;
    //post changes the value in the second step a++, a--
//Pre : changes the value immediately ++a, --a
public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1<0);  //false
        System.out.println(num2<0);

        System.out.println("-----------------------");

        int a = 5;
        ++a;  //Pre increment: increases the value by 1 right away
        System.out.println(a);  //6

        --a;  //Pre decrement : decreases the value by 1 right away

        System.out.println(a);

        int b = 100;

        System.out.println(++b);

        int c = 100;

        System.out.println(c++);  //post increment: first passes the current value, then increases the value by 1
        System.out.println(c);    //101

        System.out.println("----------------");

        int x = 200;

        System.out.println(--x); //pre decrement: decreases the value by 1 right away

        int y = 200;

        System.out.println( y-- ); //post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y); //199

        int z = 45;

        System.out.println(++z); // 46 pre increment
        System.out.println(z++); //46 post increment
        System.out.println(z);   //47

        int q = 30;

        System.out.println(--q);  //pre decrement 29
        System.out.println(q--);  //post decrement 29  next step
        System.out.println(q);                     //28



    }
}
