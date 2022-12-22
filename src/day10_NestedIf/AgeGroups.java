package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 23;
        String ageGroups = "";

        if (age>0 && age<=150){
            if (age<21){
                ageGroups = "Teenager";

            } else if (age>=21 && age<55) {
                ageGroups = "Adult";

            } else if (age>=55) {
                ageGroups = "Senior";

            }

        }   else {
            System.out.println("Invalid age");
        }
        System.out.println("AgeGroups: "+ ageGroups);







    }
}
