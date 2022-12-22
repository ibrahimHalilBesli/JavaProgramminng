package day09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 54;
        String nameOfAge = "";

        if (age >= 1 && age <= 2) {
            nameOfAge = "infant";
        } else if (age >= 3 && age <= 5) {
            nameOfAge = "Toddler";
        } else if (age >= 6 && age <= 9) {
            nameOfAge = "Kid";
        } else if (age >= 10 && age <= 12) {
            nameOfAge = "Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            nameOfAge = "Teenager";
        } else if (age >= 18 && age <= 20) {
            nameOfAge = "Young Adult";
        } else if (age >= 21 && age <= 39) {
            nameOfAge = "Adult";
        } else if (age >= 40 && age <= 49) {
            nameOfAge = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            nameOfAge = "Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            nameOfAge = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            nameOfAge = "Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            nameOfAge = "Senior Citizen";
        } else if (age >= 85) {
            nameOfAge = "Old Senior Citizen";
        } else {
            nameOfAge = "Invalid Age";
        }

        System.out.println(nameOfAge);
    }
}
