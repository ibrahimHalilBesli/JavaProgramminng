package day10_NestedIf;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 2;

        String school = "";

        if (number >= 1 && number <= 18) {

            if (number >= 1 && number <= 5) {

                school = "Elemantary school";
            } else if (number >= 6 && number <= 8) {
                school = "Middle school";

            } else if (number >= 9 && number <= 12) {
                school = "High School";

            } else if (number >= 13 && number <= 16) {
                school = "College";
            } else if (number >= 17 && number <= 18) {
                school = "Grad school";
            }

        } else {
            System.out.println("Invalid grade level");
        }

        System.out.println("School = " + school);
    }
}
