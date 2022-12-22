package day16_ForLoopPractice;

public class DigisLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); //ch: each charecter what we have in str

            if (ch >= '0' && ch <= '9') {
                digits += ch;

            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                specialChars += ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
