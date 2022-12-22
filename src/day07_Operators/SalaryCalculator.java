package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {


        int hourlyRate = 50;
        int weeklyHours = 45;
        int stateTaxRate = 6;
        int federalTaxRate = 26;


        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        int stateTax = salaryBeforeTax * stateTaxRate / 100;
        int federalTax = salaryBeforeTax * federalTaxRate / 100;
        int totalTax = stateTax + federalTax;
        int salaryAfterTax = salaryBeforeTax - stateTax - federalTax;


        System.out.println("Gross pay is:  $" + salaryBeforeTax);
        System.out.println("FederalTax is: $" + federalTax);
        System.out.println("StateTax is:   $" + stateTax);
        System.out.println("TotalTax is:   $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);


    }
}
