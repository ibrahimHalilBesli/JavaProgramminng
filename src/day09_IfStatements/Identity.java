package day09_IfStatements;

public class Identity {
    public static void main(String[] args) {

        char charecter = '@';
        String mean = "";

        if ((charecter >= 'A' && charecter <= 'Z') && (charecter >= 'a' && charecter <= 'z')) {
            mean = "Alphabetic Charecter";
        } else {
            mean = "Special Charecter";
        }
        System.out.println(mean);
    }
}
