package day09_IfStatements;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 5;
        String location = "";
        int numberOfGroups = 0;
        String teacherInCharge = "";

        if (gradeNumber == 1) {
            location = "Apple orchard";
            numberOfGroups = 3;
            teacherInCharge = "Ms. Smith";

        } else if (gradeNumber == 2) {
            location = "Zoo";
            numberOfGroups = 7;
            teacherInCharge = "Mr. Lee";

        } else if (gradeNumber == 3) {
            location = "Aquairium";
            numberOfGroups = 5;
            teacherInCharge = "Ms.Wilson";
        } else if (gradeNumber == 4) {
            location = "Movie theater";                                     
            numberOfGroups = 2;
            teacherInCharge = "Ms. Reyes";
        } else if (gradeNumber == 5) {
            location = "Museum";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Lela";

        } else if (gradeNumber == 6) {
            location = "Six Flags";
            numberOfGroups = 8;
            teacherInCharge = "Mr. Watt";
        } else {
            System.out.println("Invalid Grade");
        }
        System.out.println("gradeNumber = " + gradeNumber);
        System.out.println("location = " + location);
        System.out.println("numberOfGroups = " + numberOfGroups);
        System.out.println("teacherInCharge = " + teacherInCharge);
    }
}
