package day10_NestedIf;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 75_000;
        boolean ismMarried = true;

        double taxRate = 0;

        if (salary >= 130000){
            taxRate = 0.35;

        } else if (salary >=100000) {
                                   taxRate = 0.30;
        } else if (salary >= 80000) {
                                  taxRate = 0.25;
        }                                       else {
            taxRate = 0.20;
        }

        if (ismMarried){
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
