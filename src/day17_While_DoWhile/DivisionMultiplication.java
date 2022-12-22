package day17_While_DoWhile;

import java.util.Scanner;

public class DivisionMultiplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter firstnumber");
        int num1 = scan.nextInt();

        System.out.println("Enter second number ");
        int num2 = scan.nextInt();
        int count1 = 0;
       
        System.out.println("enter your math Operator / * ");
        char ch = scan.next().charAt(0);

        while (!(ch == '/' || ch == '*')) {
            System.err.println("Invalid Operator Pleas enter your Re Math");
            ch = scan.next().charAt(0);

        }
        if (num1>num2) {
            for (int i = 0; i <= num1; i++) {
              num1-=num2;
              count1++;
              if (num1==0){
                  break;
              }
            }
        }
        System.out.println(count1);
          scan.close();
    }

}
