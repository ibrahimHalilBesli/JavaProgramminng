package day10_NestedIf;

public class Grade {

    public static void main(String[] args) {

        char ch = 'A';
        String name = "";
        if (ch >= 'A' && ch <= 'F') {
            if (ch == 'A') {
                name = "Excellent";
            } else if (ch == 'B') {
                name = "Great Job";

            } else if (ch == 'C') {
                name = "Good";

            } else if (ch == 'D') {
                name = "Passed";

            } else if (ch == 'F') {
                name = "Failed";
            }

        } else {
            System.out.println("Invalid");
        }
         /*
       String name = (ch >= 'A' && ch <= 'F') ? (ch == 'A') ? "Excellent" : (ch == 'B') ? "Great Job"
               : (ch == 'C') ? "Good" : (ch == 'D') ? "Passed" : (ch == 'F') ? "Failed" : "Invalid";


          */
        System.out.println(name);
    }
}
