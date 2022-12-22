package day17_While_DoWhile;

import java.util.Scanner;

public class TaskCalcullattorrr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a firstNumber");
        int num1 = scan.nextInt();

        System.out.println("Enter a secondNumber");
        int num2 = scan.nextInt();

        System.out.println("Enter a Math Operator (/, +, -, *)");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {

                System.err.println("Invald Operator, please re-enter a valid Operator");
                ch = scan.next().charAt(0);


        }
        if ((ch=='+'||ch=='-'|| ch=='*'|| ch=='/')) {

            System.out.println(ch=='+'? num1+num2 :(ch=='-')? num1-num2 :(ch=='*')? num1*num2 : num1/num2);
        }
        scan.close();
    }

}
