package day23_CustomMethod.Task;

public class MathOperators {

    public static void main(String[] args) {
        calculator(10,20,'*');

    }
    //15. create a method named calculator that passes three arguments
    //(num1, num2, mathOperator), prints the calculation result

    public static void calculator(double num1, double num2, char mathOperator){

        double sum = (mathOperator=='+')? num1+num2 :(mathOperator=='*')? num1*num2 :(mathOperator== '/')? num1/num2
                : num1-num2;

        System.out.println(""+num1+mathOperator+num2+" = " + sum);
    }
}
