package day09_IfStatements;

public class Calculator {

    public static void main(String[] args) {
        int n1 = 10,
                n2 = 20;
        char operator = '-';
        int sum = 0;


        if (operator == '+') {
            sum = n1 + n2;
        } else if (operator == '-') {
            sum = n2 - n1;
        } else if (operator == '*') {
            sum = n1 * n2;
        } else if (operator == '/') {
            sum = n2 / n1;
        } else {
            System.out.println("Invalid Operator");

        }
        System.out.println(sum);
    }
}
