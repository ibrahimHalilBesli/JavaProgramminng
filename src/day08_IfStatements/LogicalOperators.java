package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Aaron";
        int age = 14;
        String citizen = "USA";

        boolean isElligible = age >= 18 && citizen == "USA";

        System.out.println(name +" is eligible to vote: "+isElligible);

        System.out.println("--------------------------");

        String name2= "Umut";

        int creditScore = 720;
        int age2 = 26;
        int income = 40000;


        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2+ " is eligible for Loan: "+isEligible2);

        System.out.println("----------------------------------------------");

        String name3 = "HAlil";
        int age3 = 24;
        char gender = 'M';

        boolean isEligible3 = age3 >= 18 && ('F' == 'M' || 'M' == 'M');

        System.out.println(name3+" is eligible to register: "+ isEligible3);

        String name4 = "James";

        String countryOfBirth = "USA";
        boolean marriedToUsCitizen = false;

        boolean isElligible4 = countryOfBirth == "USA" || marriedToUsCitizen == true;
        //                                        true                          false

        System.out.println(name4+ " is eligible to apply for US citizenShip "+ isElligible4);

        System.out.println("-------------------------------------   -----");

        String student = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student+" is eligible for scholarship: "+ isEligible5);

        boolean result2 = true;
        boolean result3 = !result2;

        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        System.out.println("----------------------------");

        int score = 85;
        boolean passed = score>= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
        
        
        
        

        
        
        
    }
}
